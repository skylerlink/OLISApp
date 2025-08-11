# OLISApp
### This is an application to satisfy the requirements of the Ohio Legislative Information Systems code screening excercise for the Software Engineer position.

## How to run
This application leverages the H2 Database dependency to enable an embedded, in-memory database. This eases setup and allows us to get up and running faster. It's worth noting, since the database is in-memory it will not persist across restarts of the application. If the application is stopped, all data is lost. Thus the database is for demonstration purposes only, a persistent database would be used in a production environment.
1. Download and install Java 17 from [Oracle](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
   - On Windows, the MSI installer is pretty straight-forward. You can read more [here for help on installing Java](https://www.java.com/en/download/help/download_options.html)
3. Download the latest .jar file from the [releases page](https://github.com/skylerlink/OLISApp/releases)
4. Open a terminal, navigate to the directory the .jar file is in and run: `java -jar OLISApp-0.0.1.jar`
   - Example screenshot from Windows of how to navigate to the directory you downloaded the .jar to and execute the command to run the jar
   - <img width="536" height="365" alt="image" src="https://github.com/user-attachments/assets/50dfc28f-caf7-410c-a4f5-6447b62a832d" />

5. Visit http://localhost:8080 in your browser

## Screenshots
### Submit page
<img width="662" height="452" alt="image" src="https://github.com/user-attachments/assets/af4fb8de-f9c4-4a9e-aeaf-bb5942f3b1ee" />

### Confirmation page / previous entries
<img width="658" height="423" alt="image-1" src="https://github.com/user-attachments/assets/c44099a4-7120-472d-8f87-5612588fde85" />

## Submission failure error
<img width="666" height="519" alt="image" src="https://github.com/user-attachments/assets/c702259b-6b51-42ed-8b74-3650fc8376b9" />
