package com.jeffpolasz.mariobros.Sprites.Items;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by Jeff on 2017-11-26.
 */

public class ItemDef {
    public Vector2 position;
    public Class<?> type;

    public ItemDef(Vector2 position, Class<?> type) {
        this.position = position;
        this.type = type;
    }
}
