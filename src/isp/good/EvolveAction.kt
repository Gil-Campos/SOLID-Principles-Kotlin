package isp.good

import model.User

class EvolveAction : UserActionUpdate, UserActionUpgrade {
    override fun updateUserAccount(user: User) {
        println("Update account ${user.name}")
    }

    override fun actionUserUpgrade(user: User) {
        println("Upgrade account ${user.name}")
    }
}

