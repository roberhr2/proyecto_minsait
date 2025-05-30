// Funcionalidad general del sitio
document.addEventListener('DOMContentLoaded', function() {
    // Manejo del formulario de filtros (página de eventos)
    const filtroForm = document.querySelector('.filtros form');
    if (filtroForm) {
        filtroForm.addEventListener('submit', function(e) {
            e.preventDefault();
            // Aquí iría la lógica para filtrar los eventos
            console.log('Filtrando eventos...');
            // En una implementación real, esto haría una solicitud AJAX o filtraría los eventos mostrados
        });
    }

    // Manejo del botón de inscripción (página de detalle)
    const btnInscribirse = document.querySelector('.btn-inscribirse');
    if (btnInscribirse) {
        btnInscribirse.addEventListener('click', function() {
            // Verificar si el usuario está logueado
            const usuarioLogueado = false; // Esto debería venir de la autenticación real
            
            if (usuarioLogueado) {
                // Lógica para inscribirse al evento
                alert('¡Te has inscrito correctamente al evento!');
                this.textContent = 'Inscrito';
                this.classList.add('btn-secondary');
                this.disabled = true;
            } else {
                // Redirigir al login o mostrar modal de registro
                alert('Por favor, inicia sesión o regístrate para inscribirte en el evento.');
                // window.location.href = 'login.html';
            }
        });
    }

    // Efecto de hover en las tarjetas de evento
    const eventoCards = document.querySelectorAll('.evento-card, .categoria, .ponente-card');
    eventoCards.forEach(card => {
        card.addEventListener('mouseenter', function() {
            this.style.transform = 'translateY(-5px)';
            this.style.boxShadow = '0 5px 15px rgba(0,0,0,0.1)';
        });
        
        card.addEventListener('mouseleave', function() {
            this.style.transform = '';
            this.style.boxShadow = '';
        });
    });
});