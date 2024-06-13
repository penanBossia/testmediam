package com.sparklingcup;

/**
 * Les items de type legendaire necessiterait un traitement particulier dans la mesure où ils n'ont pas de
 * date de péremption. Ce traitement aurait pu être facilement implémentés si les possibilités de modification de
 * la classe Item étaient plus étendues (étendre une autre classe par exemple)
 *
 * J'ai donc fait le choix d'une convention pour la date de péremption et d'overrider la méthode updateQuality avec un
 * body vide.
 * D'autres approches sont toutefois envisagebales.
 */
public class ItemSulfuras extends Item {
    public ItemSulfuras(String name) {
        super(name, Integer.MAX_VALUE, 80);
    }

    @Override
    public void updateQuality() {
        // do nothing
    }
}
