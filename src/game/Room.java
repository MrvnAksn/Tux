/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author fatou aicha kane
 */
public class Room {
    public int depth;
    public int height;
    public int width;
    public String textureBottom;
    public String textureNorth;
    public String textureEast;
    public String textureWest;
    public String textureTop;
    public String textureSouth;
    
    public Room(){
        this.textureBottom = "/textures/floor.png";
        this.textureNorth = "/textures/skybox/default/north.png";
        this.textureEast = "/textures/skybox/default/east.png";
        this.textureWest = "/textures/skybox/default/west.png";
        this.textureSouth = null;
        this.textureTop = null;
        this.depth = 50;
        this.width = 40;
        this.height = 50;
    }
}
