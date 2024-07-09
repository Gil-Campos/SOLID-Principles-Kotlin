package ocp.good

import model.User

interface RegistrationStep {
    fun execute(user: User)
}

