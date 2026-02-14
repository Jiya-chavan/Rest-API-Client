# Rest-API-Client

Company: CODTECH IT SOLUTIONS

Name: JIYA CHAVAN

Intern ID: CTIS2990

Domain: Java Programming

Duration: 4 weeks

Mentor: Neela Santosh

I developed a REST API client using Java to understand how modern applications communicate with external services over the internet using the REST architectural style. REST, which stands for Representational State Transfer, is a web-based architectural approach that uses standard HTTP methods such as GET, POST, PUT, and DELETE to enable communication between clients and servers in a stateless manner. In this project, I integrated the public weather service Open-Meteo, which provides free access to real-time and forecast weather data without requiring an API key, making it ideal for learning and experimentation. I implemented HTTP communication in Java using classes such as HttpURLConnection (or the modern HttpClient available in newer versions of Java) to send GET requests to the Open-Meteo API endpoint by constructing a properly formatted URL containing parameters like latitude, longitude, and required weather fields. Once the request was sent to the server, the API responded with data in JSON (JavaScript Object Notation) format, which is a lightweight and structured data format commonly used for data exchange between systems. I then handled the input stream returned by the HTTP connection to read the response data and convert it into a usable string format. To process and extract meaningful weather information such as temperature, wind speed, humidity, and forecast details, I parsed the JSON response using a JSON parsing library like org.json or Gson, which allowed me to access specific key-value pairs within the JSON structure efficiently. After parsing the data, I formatted and displayed the weather information in a clean, structured, and readable manner on the console, ensuring that users could easily interpret the output instead of viewing raw JSON text. Throughout the development process, I implemented proper exception handling to manage potential runtime errors such as malformed URLs, network connectivity issues, or input/output exceptions, ensuring that the application remained stable and user-friendly. This project significantly enhanced my understanding of client-server architecture, HTTP protocols, RESTful web services, and JSON data handling. I also learned how APIs serve as bridges between applications, enabling them to share and retrieve data seamlessly across networks. By building this REST API client, I gained practical experience in integrating third-party services into a Java application, handling real-time web data, and understanding the workflow of sending requests, receiving responses, parsing structured data, and presenting meaningful results to the end user. Overall, this project strengthened my knowledge of web communication concepts and demonstrated how software applications interact with external platforms in real-world scenarios.
