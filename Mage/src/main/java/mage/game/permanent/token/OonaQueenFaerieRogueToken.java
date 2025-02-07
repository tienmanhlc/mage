package mage.game.permanent.token;

import mage.MageInt;
import mage.abilities.keyword.FlyingAbility;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author spjspj
 */
public final class OonaQueenFaerieRogueToken extends TokenImpl {

    public OonaQueenFaerieRogueToken() {
        super("Faerie Rogue Token", "1/1 blue and black Faerie Rogue creature token with flying");
        cardType.add(CardType.CREATURE);
        color.setBlue(true);
        color.setBlack(true);
        subtype.add(SubType.FAERIE);
        subtype.add(SubType.ROGUE);
        power = new MageInt(1);
        toughness = new MageInt(1);
        this.addAbility(FlyingAbility.getInstance());
    }

    public OonaQueenFaerieRogueToken(final OonaQueenFaerieRogueToken token) {
        super(token);
    }

    public OonaQueenFaerieRogueToken copy() {
        return new OonaQueenFaerieRogueToken(this);
    }
}
