package isp.bad

import model.User

interface UserActions {
    fun deleteAccount(user: User)
    fun updateAccount(user: User)
    fun upgradeAccount(user: User)
}

