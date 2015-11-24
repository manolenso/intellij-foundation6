
package com.intellij.plugin.foundation6;

/**
 * @author Rémy Laurent
 */

        import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
        import org.jetbrains.annotations.Nullable;

public class Foundation6TemplatesProvider implements DefaultLiveTemplatesProvider {
    @Override
    public String[] getDefaultLiveTemplateFiles() {
        return new String[]{
                "liveTemplates/Foundation6",
        };
    }

    @Nullable
    @Override
    public String[] getHiddenLiveTemplateFiles() {
        return null;
    }
}