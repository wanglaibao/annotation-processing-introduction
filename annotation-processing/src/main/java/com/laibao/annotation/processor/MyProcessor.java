package com.laibao.annotation.processor;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class MyProcessor extends AbstractProcessor{

    private Elements elements;
    private Types types;
    private Filer filer;

    public MyProcessor() {}

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv){
        super.init(processingEnv);
    }

    @Override
    public boolean process(Set<? extends TypeElement> annoations, RoundEnvironment roundEnv) {
        return false;
    }

    /**
     * 该注解处理器所有处理的注解类型
     * 注解类型必须是全限定名
     * @return
     */
    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return Collections.EMPTY_SET;
    }

    /**
     * 所支持的JAVA 版本
     * @return
     */
    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.RELEASE_8;
    }

}
