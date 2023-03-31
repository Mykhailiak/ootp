package labs.lab6;

import labs.lab6.expressions.ConstExpression;

import java.util.HashMap;

public class Context {
    HashMap<String, Integer> hashMap = new HashMap<>();

    public Integer lookUp(String name) throws Exception {
        boolean isConstRegistered = hashMap.containsKey(name);

        if (!isConstRegistered) {
            throw new Exception("No existing constant");
        }

        return hashMap.get(name);
    }

    public Integer setConst(ConstExpression constant) {
        return this.hashMap.put(constant.getName(), constant.getValue());
    }
}