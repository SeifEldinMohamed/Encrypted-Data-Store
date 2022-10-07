package com.plcoding.androidcrypto

import kotlinx.serialization.Serializable

@Serializable // to be able to serialize that
data class UserSettings(
    val username: String? = null,
    val password: String? = null
)

// we need to encrypt what we save in datastore and decrypt what we load from datastore
// so we need to create serializer