package rootenginear.bitbybit;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BitByBit implements ModInitializer {
    public static final String MOD_ID = "bitbybit";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Bit by Bit initialized.");
    }
}
