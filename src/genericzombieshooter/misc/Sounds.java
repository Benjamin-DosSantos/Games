/**
    This file is part of Generic Zombie Shooter.

    Generic Zombie Shooter is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Generic Zombie Shooter is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Generic Zombie Shooter.  If not, see <http://www.gnu.org/licenses/>.
 **/
package genericzombieshooter.misc;

/**
 * Contains all pre-loaded sounds.
 * @author Darin Beaudreau
 */
public enum Sounds {
    // Weapon-Related
    POPGUN("shoot4.wav", false, true),
    RTPS("shoot3.wav", false, false),
    BOOMSTICK("shotgun2.wav", false, false),
    FLAMETHROWER("flamethrower2.wav", true, false),
    THROW("throw2.wav", false, false),
    EXPLOSION("explosion2.wav", false, false),
    LANDMINE_ARMED("landmine_armed.wav", false, false),
    TELEPORT("teleport2.wav", false, false),
    
    // Zombie-Related
    MOAN1("zombie_moan_01.wav", false, true),
    MOAN2("zombie_moan_02.wav", false, true),
    MOAN3("zombie_moan_03.wav", false, true),
    MOAN4("zombie_moan_04.wav", false, true),
    MOAN5("zombie_moan_05.wav", false, true),
    MOAN6("zombie_moan_06.wav", false, true),
    MOAN7("zombie_moan_07.wav", false, true),
    MOAN8("zombie_moan_08.wav", false, true),
    POISONCLOUD("poison_cloud.wav", false, false),
    
    // Game Sounds
    POWERUP("powerup2.wav", false, false),
    PURCHASEWEAPON("purchase_weapon2.wav", false, true),
    BUYAMMO("buy_ammo2.wav", false, true),
    POINTBUY("point_buy.wav", false, true),
    PAUSE("pause.wav", false, false),
    UNPAUSE("unpause.wav", false, false);
    
    private String file;

    private boolean looped; 
    private boolean overlap;

    Sounds(String filename, boolean loop, boolean over) {
        openClip(filename, loop, over);
    }

    private synchronized void openClip(String filename, boolean loop, boolean over) {
        file = filename;

        looped = loop;
        overlap = over;
    }
    
    public synchronized void play() {
     
    }
    


    public static void init() {
        values();
    }
}
