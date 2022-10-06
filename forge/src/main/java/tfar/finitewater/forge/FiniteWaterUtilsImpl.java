package tfar.finitewater.forge;

import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.fml.loading.FMLLoader;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class FiniteWaterUtilsImpl {
    public static Path getConfigDir(){
        return FMLPaths.CONFIGDIR.get();
    }
}
