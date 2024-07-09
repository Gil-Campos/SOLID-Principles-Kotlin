package isp.bad

import model.User

class HomeUserActions : UserActions {
    override fun deleteAccount(user: User) {}

    override fun updateAccount(user: User) {
        println("Update account ${user.name}")
    }

    override fun upgradeAccount(user: User) {
        println("Upgrade account ${user.name}")
    }
}



