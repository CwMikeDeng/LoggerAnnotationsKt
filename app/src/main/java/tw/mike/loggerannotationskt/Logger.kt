package tw.mike.loggerannotationskt

import tw.mike.loggerannotations.EventKey
import tw.mike.loggerannotations.ParamKey

interface Logger {

    @EventKey("AButton")
    fun logClickAButton(
        @ParamKey("button_str") buttonString: String
    )

    @EventKey("BButton")
    fun logClickBButton(
        @ParamKey("button_str") buttonString: String,
        @ParamKey("button_type") buttonType: Int
    )
}