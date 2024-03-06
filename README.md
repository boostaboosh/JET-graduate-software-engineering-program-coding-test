# Just Eat Top Ten Restaurant Finder

## Overview

This Java application retrieves restaurant data from the Just Eat Takeaway API and displays information about the top 10 restaurants based on rating for a given postcode. The displayed information includes the restaurant's name, cuisines offered, rating, and address.

## Note

This project is configured for use with IntelliJ IDEA and includes an IntelliJ project file (`top-ten-restaurant-viewer.iml`) for ease of setup. While the project can be adapted for use in other environments, this guide focuses on IntelliJ for simplicity.

## Getting Started

### Prerequisites

- Java JDK 11 or newer installed on your machine.
- IntelliJ IDEA for easy project setup and execution.

### Setup Instructions for IntelliJ IDEA Users

1. **Clone the Project**

    Open your terminal or command prompt and run the following command to clone the repository:

    ```
    git clone https://github.com/boostaboosh/JET-graduate-software-engineering-program-coding-test
    ```

2. **Open the Project in IntelliJ IDEA**

    - Launch IntelliJ IDEA.
    - Select "Open" from the welcome screen or "File > Open..." from the menu.
    - Navigate to the cloned project directory and select the `top-ten-restaurant-viewer` folder. Click "OK" to open the project.

3. **Add the JSON Library to the Project**

    The project uses a JSON library (`json-20240205.jar`) located in the `lib` directory for parsing JSON data. To add this library to your project classpath:

    - Go to "File > Project Structure > Libraries".
    - Click the "+" button to add a new library and select "Java".
    - Navigate to the `lib` directory within your project, select the `json-20240205.jar` file, and click "OK".
    - Apply the changes and close the Project Structure dialog.

4. **Build and Run the Project**

    - To build the project, select "Build > Build Project" from the main menu.
    - To run the application, open `RestaurantViewer.java` in the editor, right-click anywhere in the file, and select "Run 'RestaurantViewer.main()'".

## Functionality

The application makes a GET request to the JustEat Takeaway.com API using a hardcoded postcode (modifiable in `RestaurantViewer.java`) and processes the returned JSON to extract information about restaurants. It then sorts these restaurants by rating and displays details about the top ten rated restaurants in the console.

## Modifications and Customization

- **Changing the Postcode**: Modify the `POSTCODE` constant in `RestaurantViewer.java` to fetch restaurant data for a different location.
- **Adjusting the Number of Restaurants Displayed**: Change the `NUMBER_OF_RESTAURANTS_TO_DISPLAY` constant to display more or fewer restaurants.

## Things That Were Not Clear
The exact sorting mechanism used by the JustEat Takeaway.com API for returning restaurants.

## Future Improvements
- Enhanced UI: Migrate the console interface to a GUI for a better user experience.
- Dynamic Searching: Implement functionality for users to input postcodes directly into the application.
- Filtering Options: Allow users to filter restaurants based on different criteria (e.g., rating, name, cuisine).
- Tests: Add unit tests to ensure the reliability of key functionalities.
