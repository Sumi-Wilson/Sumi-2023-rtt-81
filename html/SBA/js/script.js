
const imageSelect = document.getElementById('image-select');
const imageDisplay = document.getElementById('image-display');
const imageDescription = document.getElementById('image-description');
const imageContainer = document.getElementById('image-container');

imageSelect.addEventListener('change', () => {
    const selectedImage = imageSelect.value;
    if (selectedImage === 'default') {
        imageContainer.style.display = 'none';
    } else {
        const imageSrc = `../images/${selectedImage}.jpg`;
        const imageDesc = {
            'image1': 'Palakkad:Where history meets serenity,unearths the treasures of Keralas ancient heartland. nestled amidst the foothills of the Western Ghats in Kerala, India, is a captivating destination that unveils its beauty in a myriad of ways. From its rich historical heritage to its enchanting natural splendor, Palakkad exudes a charm that enchants the soul.',
            'image2': 'Wayanad:  Where natures embrace knows no bounds, a sanctuary of emerald hills, cascading waterfalls, and wildlife wonders.Wayanad natural beauty is a symphony of emerald hills, cascading waterfalls, and verdant forests. The rolling hills of the Western Ghats, adorned with tea plantations and coffee estates, provide a tranquil escape into nature embrace. The Edakkal Caves, adorned with ancient rock paintings, offer a glimpse into the region prehistoric past.',
            'image3': 'Thrissur: The Cultural Heart of Kerala, A Land of Vibrant Festivals and Serene Backwaters.Thrissur cultural heritage is deeply rooted in its ancient temples, including the Vadakkumnathan Temple, a majestic architectural marvel dating back to the 10th century. The city streets come alive during the Thrissur Pooram, a spectacular festival renowned for its vibrant processions of brilliantly decorated elephants, captivating percussion ensembles, and a kaleidoscope of traditional performances.'
        };

        imageDisplay.src = imageSrc;
        imageDescription.textContent = imageDesc[selectedImage];
        imageContainer.style.display = 'flex';
    }
});
