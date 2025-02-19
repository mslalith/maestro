package maestro.orchestra.yaml

import com.fasterxml.jackson.annotation.JsonCreator

data class YamlRunFlow(
    val file: String,
    val `when`: YamlCondition? = null,
    val env: Map<String, String> = emptyMap(),
) {

    companion object {

        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(file: String) = YamlRunFlow(
            file = file,
        )
    }
}
