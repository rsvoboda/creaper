package org.wildfly.extras.creaper.commands.elytron.mapper;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.runner.RunWith;
import org.wildfly.extras.creaper.commands.elytron.AbstractAddCustomOfflineTest;


@RunWith(Arquillian.class)
public class AddCustomPrincipalTransformerOfflineTest extends AbstractAddCustomOfflineTest  {

    public String convertSubsystem(String subsystemString) {
        return subsystemString.replaceAll(PARENT_TYPE, "mappers")
            .replaceAll(CUSTOM_TYPE, "custom-principal-transformer")
            .replaceAll(CUSTOM_NAME, getAddCustomName())
            .replaceAll(CLASS_NAME, getClassName())
            .replaceAll(MODULE_NAME, getModuleName());
    }

    public String getAddCustomName() {
        return "customPrincipalTransformer";
    }

    public Object getBuilderObject(String name) {
        return new AddCustomPrincipalTransformer.Builder(name);
    }

    public String getModuleName() {
        return "org.jboss.customprincipaltransformerimpl";
    }

    public String getClassName() {
        return "SomeCustomPrincipalTransformer";
    }
}
