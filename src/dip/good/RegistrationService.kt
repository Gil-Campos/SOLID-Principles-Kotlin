package dip.good

import model.User

class RegistrationService(private val userRepository: UserRepository) {
    fun register(user: User) {
        userRepository.saveUser(user)
    }
}

