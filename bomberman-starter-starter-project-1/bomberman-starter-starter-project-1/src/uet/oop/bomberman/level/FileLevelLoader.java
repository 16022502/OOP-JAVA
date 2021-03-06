//package uet.oop.bomberman.level;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.URL;
//import uet.oop.bomberman.Board;
//import uet.oop.bomberman.Game;
//import uet.oop.bomberman.entities.LayeredEntity;
//import uet.oop.bomberman.entities.character.Bomber;
//import uet.oop.bomberman.entities.character.enemy.Balloon;
//import uet.oop.bomberman.entities.tile.Grass;
//import uet.oop.bomberman.entities.tile.destroyable.Brick;
//import uet.oop.bomberman.entities.tile.item.SpeedItem;
//import uet.oop.bomberman.exceptions.LoadLevelException;
//import uet.oop.bomberman.graphics.Screen;
//import uet.oop.bomberman.graphics.Sprite;
//import java.lang.Class;
//import java.util.StringTokenizer;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class FileLevelLoader extends LevelLoader {
//
//    /**
//     * Ma trận chứa thông tin bản đồ, mỗi phần tử lưu giá trị kí tự đọc được từ
//     * ma trận bản đồ trong tệp cấu hình
//     */
//    private static char[][] _map;
//
//    public FileLevelLoader(Board board, int level) throws LoadLevelException {
//        super(board, level);
//    }
//
//    @Override
//    public void loadLevel(int level) throws LoadLevelException {
//        // TODO: đọc dữ liệu từ tệp cấu hình /levels/Level{level}.txt
//        // TODO: cập nhật các giá trị đọc được vào _width, _height, _level, _map
//
//        ClassLoader loader = Thread.currentThread().getContextClassLoader();
//        URL url = loader.getResource("./levels/Level" + level + ".txt");
//        String path = url.getPath();
//        System.out.println(path);
//
//        String line = "";
//        try {
//            FileReader file = new FileReader(path);
//            BufferedReader bR = new BufferedReader(file);
//            line = bR.readLine();
//            String data[] = line.split(" ");
//            int curLevel = Integer.parseInt(data[0]);
//            int height = Integer.parseInt(data[1]);
//            int width = Integer.parseInt(data[2]);
//
//            char map[][] = new char[height][width];
//            for (int i = 0; i < height; i++) {
//                line = bR.readLine();
//                for (int j = 0; j < width; j++) {
//                    map[i][j] = line.charAt(j);
//                    System.out.print(map[i][j]);
//                }
//                System.out.println("");
//            }
//
//            _map = map;
//            _width = width;
//            _height = height;
//            _level = curLevel;
//
////            _lineTiles = new String[_height];
////
////            for (int i = 0; i < _height; ++i) {
////                _lineTiles[i] = bR.readLine().substring(0, _width);
////            }
//            bR.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    @Override
//    public void createEntities() {
//        // TODO: tạo các Entity của màn chơi
//        // TODO: sau khi tạo xong, gọi _board.addEntity() để thêm Entity vào game
//
//        // TODO: phần code mẫu ở dưới để hướng dẫn cách thêm các loại Entity vào game
//        // TODO: hãy xóa nó khi hoàn thành chức năng load màn chơi từ tệp cấu hình
//        // thêm Wall
//        //System.out.println(_width);
//        for (int x = 0; x < _width; x++) {
//            for (int y = 0; y < _height; y++) {
//                int pos = x + y * _width;
//                char c = _map[x][y];
////				Sprite sprite = y == 0 || x == 0 || x == 10 || y == 10 ? Sprite.wall : Sprite.grass;
////				_board.addEntity(pos, new Grass(x, y, sprite));
//                switch (c) {
//                    case 'p': {
//                        int xBomber = 1, yBomber = 1;
//                        _board.addCharacter(new Bomber(Coordinates.tileToPixel(xBomber), Coordinates.tileToPixel(yBomber) + Game.TILES_SIZE, _board));
//                        Screen.setOffset(0, 0);
//                        _board.addEntity(xBomber + yBomber * _width, new Grass(xBomber, yBomber, Sprite.grass));
//                    }
//
//                    case '1': {
//                        int xE = 2, yE = 1;
//                        _board.addCharacter(new Balloon(Coordinates.tileToPixel(xE), Coordinates.tileToPixel(yE) + Game.TILES_SIZE, _board));
//                        _board.addEntity(xE + yE * _width, new Grass(xE, yE, Sprite.grass));
//                    }
//
//                    case '*' : {
//                        int xB = 3, yB = 1;
//                        _board.addEntity(xB + yB * _width,
//                                new LayeredEntity(xB, yB,
//                                        new Grass(xB, yB, Sprite.grass),
//                                        new Brick(xB, yB, Sprite.brick)
//                                )
//                        );
//                    }
//
//                    case 'b': {
//                        int xI = 1, yI = 2;
//                        _board.addEntity(xI + yI * _width,
//                                new LayeredEntity(xI, yI,
//                                        new Grass(xI, yI, Sprite.grass),
//                                        new SpeedItem(xI, yI, Sprite.powerup_flames),
//                                        new Brick(xI, yI, Sprite.brick)
//                                )
//                        );
//                    }
//
//                }
//            }
//        }
//
//        // thêm Bomber
////        int xBomber = 1, yBomber = 1;
////        _board.addCharacter(new Bomber(Coordinates.tileToPixel(xBomber), Coordinates.tileToPixel(yBomber) + Game.TILES_SIZE, _board));
////        Screen.setOffset(0, 0);
////        _board.addEntity(xBomber + yBomber * _width, new Grass(xBomber, yBomber, Sprite.grass));
////
////        // thêm Enemy
////        int xE = 2, yE = 1;
////        _board.addCharacter(new Balloon(Coordinates.tileToPixel(xE), Coordinates.tileToPixel(yE) + Game.TILES_SIZE, _board));
////        _board.addEntity(xE + yE * _width, new Grass(xE, yE, Sprite.grass));
////
////        // thêm Brick
////        int xB = 3, yB = 1;
////        _board.addEntity(xB + yB * _width,
////                new LayeredEntity(xB, yB,
////                        new Grass(xB, yB, Sprite.grass),
////                        new Brick(xB, yB, Sprite.brick)
////                )
////        );
////
////        // thêm Item kèm Brick che phủ ở trên
////        int xI = 1, yI = 2;
////        _board.addEntity(xI + yI * _width,
////                new LayeredEntity(xI, yI,
////                        new Grass(xI, yI, Sprite.grass),
////                        new SpeedItem(xI, yI, Sprite.powerup_flames),
////                        new Brick(xI, yI, Sprite.brick)
////                )
////        );
//    }
//
//}




package uet.oop.bomberman.level;

import uet.oop.bomberman.Board;
import uet.oop.bomberman.Game;
import uet.oop.bomberman.entities.LayeredEntity;
import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.entities.character.enemy.Balloon;
import uet.oop.bomberman.entities.tile.Grass;
import uet.oop.bomberman.entities.tile.destroyable.Brick;
import uet.oop.bomberman.entities.tile.item.SpeedItem;
import uet.oop.bomberman.exceptions.LoadLevelException;
import uet.oop.bomberman.graphics.Screen;
import uet.oop.bomberman.graphics.Sprite;

import java.io.*;
import java.net.URL;
import uet.oop.bomberman.entities.tile.Wall;


public class FileLevelLoader extends LevelLoader {

    /**
     * Ma trận chứa thông tin bản đồ, mỗi phần tử lưu giá trị kí tự đọc được
     * từ ma trận bản đồ trong tệp cấu hình
     */
    private static char[][] _map;

    public FileLevelLoader(Board board, int level) throws LoadLevelException {
        super(board, level);
    }

    @Override
    public void loadLevel(int level) {
        // TODO: đọc dữ liệu từ tệp cấu hình /levels/Level{level}.txt
        // TODO: cập nhật các giá trị đọc được vào _width, _height, _level, _map

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource("./levels/Level"+level+".txt");
        String path = url.getPath();

        System.out.println(path);


        String line = "";
        try {
            FileReader fileReader =
                    new FileReader(path);

            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            line = bufferedReader.readLine();

//            System.out.println(Integer.parseInt(line.split(" ")[0]));
//            System.out.println(Integer.parseInt(line.split(" ")[1]));
//            System.out.println(Integer.parseInt(line.split(" ")[2]));

            int curLevel = Integer.parseInt(line.split(" ")[0]);
            int height = Integer.parseInt(line.split(" ")[1]);
            int width = Integer.parseInt(line.split(" ")[2]);

            char map[][] = new char[height][width];

            for (int i = 0; i < height; i++) {
                line = bufferedReader.readLine();
                for (int j = 0; j < width; j++) {
                    map[i][j] = line.charAt(j);
                    System.out.print(map[i][j]);
                }
                System.out.println("");
            }

            _map = map;
            _width = width;
            _height = height;
            _level = curLevel;

            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createEntities() {
        // TODO: tạo các Entity của màn chơi
        // TODO: sau khi tạo xong, gọi _board.addEntity() để thêm Entity vào game

        // TODO: phần code mẫu ở dưới để hướng dẫn cách thêm các loại Entity vào game
        // TODO: hãy xóa nó khi hoàn thành chức năng load màn chơi từ tệp cấu hình
        // thêm Wall
        System.out.println(getWidth());
        System.out.println(getHeight());

        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                int pos = x + y * getWidth();
               Sprite sprite = Sprite.grass;
                switch (_map[y][x]) {
                    case '#':
                        sprite = Sprite.wall;
                        _board.addEntity(pos, new Wall(x, y, sprite));
                        break;
                    case '*':
                        int xB = x, yB = y;
                        _board.addEntity(xB + yB * _width,
                                new LayeredEntity(xB, yB,
                                        new Grass(xB, yB, Sprite.grass),
                                        new Brick(xB, yB, Sprite.brick)
                                )
                        );
                        break;
                    case 'x':
                        sprite = Sprite.portal;
                        _board.addEntity(pos, new Grass(x, y, sprite));
                        break;
                    case 'p':
                        int xBomber = x, yBomber = y;
                        _board.addCharacter(new Bomber(Coordinates.tileToPixel(xBomber), Coordinates.tileToPixel(yBomber) + Game.TILES_SIZE, _board));
                        Screen.setOffset(0, 0);
                        _board.addEntity(xBomber + yBomber * _width, new Grass(xBomber, yBomber, Sprite.grass));
                        break;
                    case '1':
                        int xE = x, yE = y;
                        _board.addCharacter(new Balloon(Coordinates.tileToPixel(xE), Coordinates.tileToPixel(yE) + Game.TILES_SIZE, _board));
                        _board.addEntity(xE + yE * _width, new Grass(xE, yE, Sprite.grass));

                        break;
                    case '2':
                        sprite = Sprite.oneal_left1;
                        _board.addEntity(pos, new Grass(x, y, sprite));

                        break;
                    default:
                        _board.addEntity(pos, new Grass(x, y, sprite));
                        break;
                }
            }
        }

        // thêm Bomber


        // thêm Enemy


        // thêm Brick


        // thêm Item kèm Brick che phủ ở trên
        int xI = 1, yI = 2;
        _board.addEntity(xI + yI * _width,
                new LayeredEntity(xI, yI,
                        new Grass(xI, yI, Sprite.grass),
                        new SpeedItem(xI, yI, Sprite.powerup_flames),
                        new Brick(xI, yI, Sprite.brick)
                )
        );
    }

}