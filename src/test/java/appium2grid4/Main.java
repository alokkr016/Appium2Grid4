package appium2grid4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        CommonUtils.executePermissionToScripts();
        CommonUtils.runScript("RunGrid.sh");
        CommonUtils.runScript("RunAppium.sh");
//        CommonUtils.runScript("RegisterNode.sh");

        Thread.sleep(10000);

    }
}
