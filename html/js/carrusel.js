document.addEventListener('DOMContentLoaded', function() {
    const carrusel = document.querySelector('.carrusel');
    if (!carrusel) return;

    const contenedor = carrusel.querySelector('.carrusel-contenedor');
    const slides = carrusel.querySelectorAll('.carrusel-slide');
    const btnPrev = carrusel.querySelector('.prev');
    const btnNext = carrusel.querySelector('.next');
    const puntosContainer = carrusel.querySelector('.carrusel-puntos');

    let currentIndex = 0;
    const totalSlides = slides.length;

    // Crear puntos de navegación
    for (let i = 0; i < totalSlides; i++) {
        const punto = document.createElement('div');
        punto.classList.add('punto');
        if (i === 0) punto.classList.add('active');
        punto.addEventListener('click', () => goToSlide(i));
        puntosContainer.appendChild(punto);
    }

    const puntos = carrusel.querySelectorAll('.punto');

    // Función para ir a un slide específico
    function goToSlide(index) {
        currentIndex = index;
        updateCarousel();
    }

    // Función para actualizar el carrusel
    function updateCarousel() {
        contenedor.style.transform = `translateX(-${currentIndex * 100}%)`;
        
        // Actualizar puntos
        puntos.forEach((punto, index) => {
            punto.classList.toggle('active', index === currentIndex);
        });
    }

    // Event listeners para botones
    btnPrev.addEventListener('click', () => {
        currentIndex = (currentIndex > 0) ? currentIndex - 1 : totalSlides - 1;
        updateCarousel();
    });

    btnNext.addEventListener('click', () => {
        currentIndex = (currentIndex < totalSlides - 1) ? currentIndex + 1 : 0;
        updateCarousel();
    });

    // Auto-avance del carrusel
    let intervalo = setInterval(() => {
        currentIndex = (currentIndex < totalSlides - 1) ? currentIndex + 1 : 0;
        updateCarousel();
    }, 5000);

    // Pausar auto-avance al interactuar
    carrusel.addEventListener('mouseenter', () => clearInterval(intervalo));
    carrusel.addEventListener('mouseleave', () => {
        intervalo = setInterval(() => {
            currentIndex = (currentIndex < totalSlides - 1) ? currentIndex + 1 : 0;
            updateCarousel();
        }, 5000);
    });

    // Soporte para touch en dispositivos móviles
    let touchStartX = 0;
    let touchEndX = 0;

    carrusel.addEventListener('touchstart', (e) => {
        touchStartX = e.changedTouches[0].screenX;
        clearInterval(intervalo);
    }, {passive: true});

    carrusel.addEventListener('touchend', (e) => {
        touchEndX = e.changedTouches[0].screenX;
        handleSwipe();
        intervalo = setInterval(() => {
            currentIndex = (currentIndex < totalSlides - 1) ? currentIndex + 1 : 0;
            updateCarousel();
        }, 5000);
    }, {passive: true});

    function handleSwipe() {
        const diff = touchStartX - touchEndX;
        if (diff > 50) {
            // Swipe izquierda
            currentIndex = (currentIndex < totalSlides - 1) ? currentIndex + 1 : 0;
        } else if (diff < -50) {
            // Swipe derecha
            currentIndex = (currentIndex > 0) ? currentIndex - 1 : totalSlides - 1;
        }
        updateCarousel();
    }
});