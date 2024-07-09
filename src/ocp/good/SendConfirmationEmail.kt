package ocp.good

import model.User

class SendConfirmationEmail : RegistrationStep {
    override fun execute(user: User) {
        println("Sending confirmation email to ${user.email}")
    }
}

