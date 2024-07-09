package isp.good

import model.User

class TerminatingActions : UserActionDelete {
    override fun deleteUserAccount(user: User) {
        println("Delete account ${user.name}")
    }
}

