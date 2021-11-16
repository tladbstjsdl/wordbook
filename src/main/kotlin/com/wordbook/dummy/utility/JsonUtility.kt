package com.wordbook.dummy.utility

import com.google.gson.Gson
import com.google.gson.JsonIOException
import com.google.gson.JsonObject
import com.google.gson.JsonSyntaxException
import com.google.gson.internal.Primitives
import com.google.gson.stream.JsonReader
import java.io.Reader
import java.util.*

class JsonUtility {
	companion object {
		private val gson :Gson = Gson()

		fun <T> fromJson(json :String, classOfT :Class<T>) :T {
			return gson.fromJson<T>(json, classOfT)
		}

		fun getIntFromJson(json :JsonObject, name :String) :Int? {
			return try {
				json.get(name).asInt
			} catch(e :UnsupportedOperationException) {
				null
			} catch(e :Exception) {
				e.printStackTrace()

				null
			}
		}

		fun getLongFromJson(json :JsonObject, name :String) :Long? {
			return try {
				json.get(name).asLong
			} catch(e :UnsupportedOperationException) {
				null
			} catch(e :Exception) {
				e.printStackTrace()

				null
			}
		}

		fun getStringFromJson(json :JsonObject, name :String) :String? {
			return try {
				json.get(name).asString
			} catch(e :UnsupportedOperationException) {
				null
			} catch(e :Exception) {
				e.printStackTrace()

				null
			}
		}

		fun <T> getListFromJson(json :JsonObject, name :String) :List<T>? {
			return try {
				json.get(name).asJsonArray.toList() as List<T>
			} catch(e :UnsupportedOperationException) {
				null
			} catch(e :Exception) {
				e.printStackTrace()

				null
			}
		}

		fun inputParamsToJson(json :JsonObject, params :Map<String, String?>) : JsonObject {
			params.forEach { (k, v) ->
				json.addProperty(k, v)
			}

			return json
		}
	}
}