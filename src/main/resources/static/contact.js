document.addEventListener('DOMContentLoaded', function() {
    const form = document.querySelector('form');
    
    form.addEventListener('submit', function(event) {
        event.preventDefault(); // Prevent the default form submission
        
        // Display the success message
        alert('Message sent successfully!');
        
        // Optionally, you can reset the form after submission
        form.reset();
    });
});