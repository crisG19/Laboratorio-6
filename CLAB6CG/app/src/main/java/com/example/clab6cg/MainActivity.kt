package com.example.clab6cg


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONObject

fun main() = runBlocking {
    try {

        val URLciudad = "https://api.teleport.org/api/urban_areas/"
        val ciudadJ = Datos(URLciudad)

        val ciudad = ciudadJ.getJSONArray("items")


        for (i in 0 until ciudad.length()) {
            val ciudad = ciudad.getJSONObject(i)
            val Nciudad = ciudad.getString("nombre")
            val Sciudad = ciudad.getString("slug")
            val URLimagenC = "https://api.teleport.org/api/urban_areas/slug:$Sciudad/images/"

            println("Nombre de la ciudad: $Nciudad")
            println("Imagen de la ciudad: $URLimagenC")
            println()
        }


        val Nciudad = "zurich"
        val URLimagenC = "https://api.teleport.org/api/urban_areas/slug:$Nciudad/images/"
        val ImagenC = Datos(URLimagenC)

        val imagen = ImagenC.getJSONArray("photos")


        if (imagen.length() > 0) {
            val Pfoto = imagen.getJSONObject(0)
            val URLimagen = Pfoto.getJSONObject("imagen").getString("")
            println("Imagen de $Nciudad: $URLimagen")
        } else {
            println("No existen imagenes $Nciudad.")
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

suspend fun Datos(url: String): JSONObject = withContext(Dispatchers.IO) {
    val cliente = OkHttpClient()
    val solicitud = Request.Builder()
        .url(url)
        .build()

    val res = cliente.newCall(solicitud).execute()
    val resp = res.body?.string()

    return@withContext JSONObject(resp)
}
