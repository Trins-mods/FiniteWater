package tfar.finitewater.fabric;

import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.nio.file.Path;

public class FiniteWaterUtilsImpl {
    public static Path getConfigDir(){
        return FabricLoader.getInstance().getConfigDir();
    }
}
