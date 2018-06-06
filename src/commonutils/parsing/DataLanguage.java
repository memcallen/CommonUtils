/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commonutils.parsing;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Semicolons are optional, but newlines are also used as delimeters<br>
 * Sample:
 * <code>
 * [SectionName]
 * DataVar = DataValue
 * [DataVar, Var, etc] = DataValue
 * 
 * 
 * DataExpression[NamedInputs, etc] = Expression
 * </code>
 * 
 * where DataValue is:
 * 
 * <code>
 * Array: [Value, Value, etc]
 * Dictionary: {Key=Value, etc}
 * Number: Any Int or Float
 * String: "Value"
 * Expression: Any math or Java Stream-like expression
 * </code>
 * 
 * TODO add author
 * @author
 */
public class DataLanguage {
    
    public static HashMap<String, ArrayList<DataValue>> parse(String text) {
        
        //TODO this
        
        return null;
        
    }
    
    private static int FindNext(String text, int from, String characters) {
        
        while(characters.indexOf(text.charAt(from)) == -1) {
            from++;
        }
        
        return from;
    }
    
}
