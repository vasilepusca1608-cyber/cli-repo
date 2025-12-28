package pixelacademy.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MagicRestConroller {

    @Value("${wizard.name}")
    private String wizardName;

    @Value("${wizard.house}")
    private String wizardHouse;

    @Value("${wizard.spell}")
    private String wizardSpell;
}
