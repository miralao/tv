// Frontend JavaScript Application Logic

// Sample function to get current date and time
function getCurrentDateTime() {
    const now = new Date();
    return now.toUTCString();
}

// Sample function to display a greeting
function greetUser() {
    const greeting = 'Welcome to the Frontend Application!';
    console.log(greeting);
}

// Call the functions to check them
console.log(getCurrentDateTime());
greetUser();
