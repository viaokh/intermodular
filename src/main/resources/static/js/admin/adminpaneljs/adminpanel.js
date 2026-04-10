//Parte de seciones

const enlaces = document.querySelectorAll('aside a')

enlaces.forEach(enlace => {
    enlace.addEventListener('click', function(e) {
        e.preventDefault()


        enlaces.forEach(e => e.classList.remove('active'))

        this.classList.add('active')

        const secciones = document.querySelectorAll('main section')
        secciones.forEach(s => s.classList.remove('active'))

        const id = this.dataset.section
        document.getElementById(id).classList.add('active')
    })
})


//Drop Down del usuario
const btnUsuario = document.getElementById('btn-usuario')
const dropdown = document.querySelector('.dropdown')

btnUsuario.addEventListener('click', function(e) {
    e.stopPropagation()
    dropdown.classList.toggle('visible')
})

document.addEventListener('click', function() {
    dropdown.classList.remove('visible')
})

//Secion Usuarios
document.querySelector('[data-section="users"]').click()

// Logout
const logoutBtn = document.getElementById('logoutBtn')

logoutBtn.addEventListener('click', async function () {
    try {
        await fetch('/api/logout', {
            method: 'POST',
            credentials: 'include'
        })

        // redirigir
        window.location.href = '/login.html'

    } catch (error) {
        console.error('Error al cerrar sesión:', error)
    }
})
