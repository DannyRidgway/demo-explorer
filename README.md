# Cloud Demo Parser
A demo parser site that allows you to register, login, upload and save demos.  

Pages that show game data in detail much like the CSGO demo manager desktop app. 

#### Games Supported
Counter Strike: Global Offensive  
Dota 2  
League Of Legends

#### Developed Using
IntelliJ IDEA  
Java  
Gradle  
Spring
Thymeleaf
jQuery  

#### Highly WIP
##### Phase 1
* Index / Header / Footer Pages  
* Session Handling  
* Message Handling /w Multiple Languages
* MariaDB Implementation  
* jQuery Implementation  
* Test Units  
* Docker/Kubernetes/Liquibase Deployment

##### Phase 2
* Database Design  
* Registration (BCrypt)   
* Login And Logout Pages  
* Test Units  

##### Phase 3
* Account Page - Integrate with Steam. Link or Login with Steam.
* Upload Page  
* Google Cloud Storage - Upload to GCS directly from the client. Generate a Signed URL from the Server which the client uses.
* Service to parse the files located in GCS. No realtime parsing. Queued up to be parsed. 
* Test Units  

##### Phase 4
* Dashboard Page - Demo's parsed, to be parsed. Total Statistics. ect
* Demo List Page
* Demo Details Page
* Test Units 