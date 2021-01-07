package br.inatel.cdg.annotation.reading;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Caso se tenha um @Target de Annotation, desmarcar os comentários abaixo

//import java.lang.annotation.ElementType.FIELD;
//import java.lang.annotation.ElementType.METHOD;
//import java.lang.annotation.ElementType.LOCAL_VARIABLE;
//import java.lang.annotation.Target;

//@Target({FIELD, METHOD, LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface NumberToSum {
    int value();
}
