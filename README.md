# Laboratorio-6
Lab6 Plataforma Moviles
API EXPLORER
Teleport
ROOT : ROOTShow/HideList OperationsExpand Operations
GET /Hypermedia Application Language (HAL) root
CITIES : CITIES AND OTHER POPULATED AREASShow/HideList OperationsExpand Operations
GET /cities/Find cities by name
GET /cities/{city_id}/Get city information
GET /cities/{city_id}/alternate_names/Get alternate names for a city
CONTINENTSShow/HideList OperationsExpand Operations
GET /continents/List all continents
GET /continents/{continent_id}/Get continent information
GET /continents/{continent_id}/countries/Get continent country list
GET /continents/{continent_id}/urban_areas/Get continent urban area list
COUNTRIES : WORLD COUNTRIESShow/HideList OperationsExpand Operations
GET /continents/{continent_id}/countries/Get continent country list
GET /countries/List all countries
GET /countries/{country_id}/Get country information
GET /countries/{country_id}/admin1_divisions/List all first-level administrative divisions for a country
GET /countries/{country_id}/admin1_divisions/{admin1_id}/Get first-level administrative division information
GET /countries/{country_id}/admin1_divisions/{admin1_id}/cities/List cities for a first-level administrative division
GET /countries/{country_id}/salaries/Get 25th, 50th, 75th percentile for country salaries
URBAN_AREAS : TELEPORT URBAN AREAS (AKA TELEPORT STARTUP CITIES)Show/HideList OperationsExpand Operations
GET /continents/{continent_id}/urban_areas/Get continent urban area list
GET /urban_areas/List all Teleport Urban Areas
GET /urban_areas/{ua_id}/Get urban area information
GET /urban_areas/{ua_id}/cities/Get urban area cities list
GET /urban_areas/{ua_id}/details/Get urban area detailed data
GET /urban_areas/{ua_id}/images/Get urban area images
GET /urban_areas/{ua_id}/salaries/Get 25th, 50th, 75th percentile for urban area salaries
GET /urban_areas/{ua_id}/scores/Get urban area scores
FLOCK : TELEPORT FLOCKShow/HideList OperationsExpand Operations
POST /flock/plans/Create a Flock plan for a common meeting place
GET /flock/plans/{plan_id}/Get information about a pre-existing Flock plan
IPADDRESS : IP ADDRESSShow/HideList OperationsExpand Operations
GET /ipaddresses/{address}/Looks up location based on IP address
LOCATIONS : EVERYTHING AROUND A GEOGRAPHIC COORDINATEShow/HideList OperationsExpand Operations
GET /locations/{coordinates}/Gets geographical features at a location.
TIMEZONES : TIMEZONESShow/HideList OperationsExpand Operations
GET /timezones/List all timezones
GET /timezones/{tz_id}/Get timezone information
GET /timezones/{tz_id}/offsets/Get timezone information
[ base url: /api , api version: 1.0.0 ]