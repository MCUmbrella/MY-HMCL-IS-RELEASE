package org.jackhuang.hmcl;

import java.nio.file.Path;
import org.jackhuang.hmcl.util.io.JarUtils;
import org.jackhuang.hmcl.util.platform.OperatingSystem;

public final class Metadata
{
    public static final String NAME = "HMCL";
    public static final String FULL_NAME = "Hello Minecraft! Launcher";
    public static final String VERSION = System.getProperty("hmcl.version.override", JarUtils.getManifestAttribute("Implementation-Version", "@develop@"));
    public static final String TITLE = "HMCL " + VERSION;
    public static final String FULL_TITLE = "Hello Minecraft! Launcher v" + VERSION;
    public static final String UPDATE_URL = System.getProperty("hmcl.update_source.override", "https://127.0.0.1:1");
    public static final String CONTACT_URL = "https://github.com/huanghongxun/HMCL/issues";
    public static final String HELP_URL = "https://hmcl.huangyuhui.net/help";
    public static final String CHANGELOG_URL = "https://docs.hmcl.net/changelog/";
    public static final String PUBLISH_URL = "https://www.mcbbs.net/thread-142335-1-1.html";
    public static final String EULA_URL = "https://hmcl.huangyuhui.net/eula";
    public static final String BUILD_CHANNEL = "stable";
    public static final Path MINECRAFT_DIRECTORY = OperatingSystem.getWorkingDirectory("minecraft");
    public static final Path HMCL_DIRECTORY = OperatingSystem.getWorkingDirectory("hmcl");

    private Metadata() {}

    public static boolean isStable()
    {
        return true;
    }

    public static boolean isDev()
    {
        return false;
    }

    public static boolean isNightly()
    {
        return false;
    }
}
