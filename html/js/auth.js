document.addEventListener('DOMContentLoaded', function() {
    // Formulario de registro
    const registroForm = document.getElementById('registroForm');
    if (registroForm) {
        registroForm.addEventListener('submit', function(e) {
            e.preventDefault();
            
            // Validación básica
            const password = document.getElementById('password').value;
            const confirmPassword = document.getElementById('confirm_password').value;
            
            if (password !== confirmPassword) {
                showMessage('Las contraseñas no coinciden', 'error');
                return;
            }
            
            // Simular envío del formulario
            showMessage('Registro exitoso! Redirigiendo...', 'success');
            
            // En un caso real, aquí haríamos una petición AJAX al servidor
            setTimeout(() => {
                window.location.href = 'index.html';
            }, 1500);
        });
    }
    
    // Formulario de login
    const loginForm = document.getElementById('loginForm');
    if (loginForm) {
        loginForm.addEventListener('submit', function(e) {
            e.preventDefault();
            
            // Simular inicio de sesión
            showMessage('Inicio de sesión exitoso! Redirigiendo...', 'success');
            
            // Guardar en localStorage que el usuario está logueado
            localStorage.setItem('usuarioLogueado', 'true');
            
            // En un caso real, aquí haríamos una petición AJAX al servidor
            setTimeout(() => {
                window.location.href = 'eventos.html';
            }, 1500);
        });
    }
    
    // Botones de login social
    const googleBtn = document.querySelector('.btn-social.google');
    if (googleBtn) {
        googleBtn.addEventListener('click', function() {
            showMessage('Redirigiendo a Google para autenticación...', 'success');
            // En un caso real, redirigiría a la autenticación de Google
        });
    }
    
    const facebookBtn = document.querySelector('.btn-social.facebook');
    if (facebookBtn) {
        facebookBtn.addEventListener('click', function() {
            showMessage('Redirigiendo a Facebook para autenticación...', 'success');
            // En un caso real, redirigiría a la autenticación de Facebook
        });
    }
    
    // Función para mostrar mensajes
    function showMessage(text, type) {
        // Eliminar mensajes anteriores
        const oldMessage = document.querySelector('.message');
        if (oldMessage) oldMessage.remove();
        
        // Crear nuevo mensaje
        const message = document.createElement('div');
        message.className = `message ${type}`;
        message.textContent = text;
        
        // Insertar antes del formulario
        const form = document.querySelector('form');
        form.insertBefore(message, form.firstChild);
        
        // Eliminar después de 5 segundos
        setTimeout(() => {
            message.remove();
        }, 5000);
    }
});