package pixelacademy.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MagicRestConroller {

    //injecting props from apllicationa.properties
    @Value("${wizard.name}")
    private String wizardName;

    @Value("${wizard.house}")
    private String wizardHouse;

    @Value("${wizard.spell}")
    private String wizardSpell;

    // expose endpoint "/team"

    @GetMapping("/team")
    public String getTeamInfo(){
        return "Wizard name: " + wizardName +
                ", Wizard house: " + wizardHouse +
                " Wizard spell: " + wizardSpell;
    }

    @GetMapping("/name")
    public String getWizardName(){
        return "Wizard name: " + wizardName;
    }

    @GetMapping("/house")
    public String getWizardHouse(){
        return "Wizard house: " + wizardHouse;
    }

    @GetMapping("/spell")
    public String getWizardSpell(){
        return "Wizard spell: " + wizardSpell;
    }
}
