fun main() {
    val notificaciones: List<Notificable> = listOf(
        CorreoElectronico(),
        MensajeTexto(),
        NotificacionPush()
    )

    notificaciones.forEach { it.enviarNotificacion() }
}
