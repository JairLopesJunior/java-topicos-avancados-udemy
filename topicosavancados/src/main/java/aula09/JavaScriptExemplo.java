package aula09;

import javax.script.*;

public class JavaScriptExemplo {

    public static void main(String[] args) throws ScriptException {

        ScriptEngine se = new ScriptEngineManager().getEngineByName("Nashorn"); // Nome da maquina

        // Indica que os atributos do codigo JS estaram visiveis durante o tempo de vida do ScriptEngine
        Bindings bindings = se.getBindings(ScriptContext.ENGINE_SCOPE);

        String a = "asdasd";
        bindings.put("a", a);

        se.eval("print('Vai Corintha!!' + a)");
    }
}
