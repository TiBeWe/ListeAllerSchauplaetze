document.getElementById('searchButton').addEventListener('click', function() {
    const searchQuery = document.getElementById('search').value;
    if (searchQuery) {
        fetch(`/search?ort=${encodeURIComponent(searchQuery)}`)
            .then(response => response.json())
            .then(data => {
                if (data.length > 0) {
                    window.location.href = `ausgabe.html?ort=${encodeURIComponent(searchQuery)}`;
                } else {
                    alert('Keine Schauplätze gefunden.');
                }
            })
            .catch(error => console.error('Error:', error));
    }
});
