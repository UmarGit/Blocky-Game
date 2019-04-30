 import java.io.File;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.animation.RotateTransition;
import javafx.animation.RotateTransitionBuilder;
import javafx.util.Duration;
import javafx.animation.Timeline;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author umars
 */
public class Blocky extends Application {
Label bl1,bl2,bl3,target1,target2,target3, bll1,bll2,bll3,bll4,targetl1,targetl2,targetl3,targetl4,bl21,bl22,bl23,bl24,bl25,target21,target22,target23,target24,target25,b31,bl32,bl33,bl34,bl35,bl36,target31,target32,target33,target34,target35,target36;
Stage window;
Rectangle rec1,rec2,rec3,rec11,rec12,rec13,rec14,rec21,rec22,rec23,rec24,rec25,rec31,rec32,rec33,rec34,rec35,rec36;
Rectangle rect,rect2,rect3,rect4;
Group layout3,layout4;
GridPane layout123;
StackPane layout,layout2,layoutlvl,layoutlvl2,layoutlvl3,layoutlvl4,layout5;
RotateTransition rotateTransition,rotateTransition2,rotateTransition3,rotateTransition4;
Scene scene,scene2,scene3,scene4,scene5,scene51,scene52,scene53,scene6,scene7,scene8;
int resx=1920;
int resy=1200;
int sec=5;
File fileimback,fileintro,fileaudi,filelevels,filelvlcom;
Image image;
ImageView imview;
Media media,media2;
MediaPlayer medplay,medplay2,medplay3;
MediaView medview,medview2;
FadeTransition fade,fade2,fade3,fade4,fademenuhead1,fademenuhead2,fadelevel1,fadelevel2,fadelevel3,fadelevel4,fadetext;
Text text,text2,text3;
AudioClip audiclip,audilevel;
MenuBar menubar;
Menu menu;
MenuItem menuitem;
BorderPane borderlayout3;
Label menuhead1,menuhead2;
Circle c1,c2,c3,c4;

Double Score=0.0;

boolean ans=false;
boolean ans2=false;
boolean ans3=false;

boolean ans22=false;
boolean ans23=false;
boolean ans24=false;
boolean ans25=false;


boolean ans32=false;
boolean ans33=false;
boolean ans34=false;
boolean ans35=false;
boolean ans36=false;

boolean ans42=false;
boolean ans43=false;
boolean ans44=false;
boolean ans45=false;
boolean ans46=false;
boolean ans47=false;



boolean key;
boolean key2;
boolean key3;
boolean key4;
Text mainmenu;
//rotating rectangle animation on scene2
    public void rotaterect(double height,double width){
        
        
        rect = new Rectangle(20, 20, 70, 70);
        rect.setArcHeight(20);
        rect.setArcWidth(20);
        rect.setTranslateX(width);
        rect.setTranslateY(height);
        rect.setFill(Color.GREEN);

        rotateTransition = RotateTransitionBuilder.create()
                .node(rect)
                .duration(Duration.seconds(sec))
                .fromAngle(0)
                .toAngle(720)
                .cycleCount(Timeline.INDEFINITE)
                .autoReverse(true)
                .build();
        rotateTransition.play();
    }
    public void rotaterect2(double height,double width){
        
        
        rect2 = new Rectangle(20, 20, 70, 70);
        rect2.setArcHeight(20);
        rect2.setArcWidth(20);
        rect2.setTranslateX(width);
        rect2.setTranslateY(height);
        rect2.setFill(Color.YELLOW);

        rotateTransition2 = RotateTransitionBuilder.create()
                .node(rect2)
                .duration(Duration.seconds(sec))
                .fromAngle(0)
                .toAngle(720)
                .cycleCount(Timeline.INDEFINITE)
                .autoReverse(true)
                .build();
        rotateTransition2.play();
    }
    public void rotaterect3(double height,double width){
        
        
        rect3 = new Rectangle(20, 20, 70, 70);
        rect3.setArcHeight(20);
        rect3.setArcWidth(20);
        rect3.setTranslateX(width);
        rect3.setTranslateY(height);
        rect3.setFill(Color.RED);

        rotateTransition3 = RotateTransitionBuilder.create()
                .node(rect3)
                .duration(Duration.seconds(sec))
                .fromAngle(0)
                .toAngle(720)
                .cycleCount(Timeline.INDEFINITE)
                .autoReverse(true)
                .build();
        rotateTransition3.play();
    }
    public void rotaterect4(double height,double width){
        
        
        rect4 = new Rectangle(20, 20, 70, 70);
        rect4.setArcHeight(20);
        rect4.setArcWidth(20);
        rect4.setTranslateX(width);
        rect4.setTranslateY(height);
        rect4.setFill(Color.BLUE);

        rotateTransition4 = RotateTransitionBuilder.create()
                .node(rect4)
                .duration(Duration.seconds(sec))
                .fromAngle(0)
                .toAngle(720)
                .cycleCount(Timeline.INDEFINITE)
                .autoReverse(true)
                .build();
        rotateTransition4.play();
    }
   
    public static void main(String[] args) {
       launch(args);
       
    }
    double orgSceneX ;
    double orgSceneY ;
    double orgTranslateX ; 
    double orgTranslateY ;

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        window=primaryStage;
        window.setTitle("Blocky");
        //BOX1
        rotaterect(150,70);
        //BOX2
        rotaterect2(150,210);
        //BOX3
        rotaterect3(150,-70);
        //BOX4
        rotaterect4(150,-210);
        
        //setting background on scenes
        fileimback=new File("C:\\\\Users\\\\umars\\\\OneDrive\\\\Documents\\\\Blocky Game\\media\\final.png");
        image=new Image(fileimback.toURI().toURL().toString(),resx,resy,false,true);
        imview=new ImageView(image);
        //setting media on scene1
        fileintro =new File("C:\\\\Users\\\\umars\\\\OneDrive\\\\Documents\\\\Blocky Game\\media\\finalintro.mp4");
        Media media=new Media(fileintro.toURI().toURL().toString());
	    MediaPlayer medplay=new MediaPlayer(media);
        MediaView medview=new MediaView(medplay);
        medplay.play();
        
        fade2=new FadeTransition();
        fade3=new FadeTransition();
        
        text2=new Text("Click to Start");
        text2.setFont(Font.font(90));
        text2.setOpacity(0);
        //first layout with media and click here to start
        layout=new StackPane();
        layout.getChildren().addAll(medview,text2);
        scene=new Scene(layout,resx,resy);
        fade3();
        medview.setOnMouseClicked(e -> {
            window.setScene(scene2);
            window.setFullScreen(true);
            fade();
            fade2();
           medplay.stop();
        });
        //second scene with loading animation
        text=new Text("Loading...");
        text.setFont(Font.font(150));
        layout2=new StackPane();
        layout2.getChildren().addAll(imview,rect,rect2,rect3,rect4,text);
        scene2=new Scene(layout2,resx,resy);
        fade=new FadeTransition();
        //new audio for starting our game
        fileaudi=new File("C:\\Users\\umars\\OneDrive\\Documents\\Blocky Game\\media\\audistart.mp3");
        audiclip=new AudioClip(fileaudi.toURI().toURL().toString());
        
        fade2.setOnFinished(e -> {
         window.setScene(scene3);
            window.setFullScreen(true);
            fade4();
            fademenuheading1();
            fademenuheading2();
            audiclip.play();
          audiclip.setCycleCount(100);
            
        });
       
        fade4=new FadeTransition();
        
        
        VBox vbox1=new VBox();
      //creating HBox for our menu  
     HBox hbox1=new HBox(50);   
      Button b1=new Button("Score Card");
      b1.setTranslateX(1600);
      b1.setTranslateY(20);
      b1.setFont(Font.font(20));
      b1.setTextFill(Color.BLUE);
      b1.setOnAction(e ->{
    	  Alert alert1=new Alert(AlertType.CONFIRMATION);
    	  alert1.setContentText("Greetings,Welcome to our Blocky Land "+
    	  "YOUR SCORE WILL BE DISPLAYED HERE!"+
    			  "YOU SCORE "+Score+" POINTS,CONGRATULATION");
    	  alert1.setTitle("SCORE CARD");
    	  alert1.showAndWait();
      });
      b1.disarm();
      Button b2=new Button("Exit Game");
      b2.setTranslateY(20);
      b2.setTranslateX(b1.getTranslateX());
      b2.setFont(Font.font(20));
      b2.setTextFill(Color.BLUE);
      b2.setOnAction(e ->{
    	  window.close();
      });
      hbox1.getChildren().addAll(b1,b2);
      
      HBox hbox2=new HBox(10);   
      Label label1=new Label("Level 1");
      label1.setFont(Font.font(50));
      c1=new Circle(100);
      c1.setTranslateY(450);
      c1.setTranslateX(300);
      c1.setStroke(Color.BLACK);
      c1.setStrokeWidth(8);
      label1.setTranslateX(105);
      label1.setTranslateY(c1.getTranslateY()+70);      
      c1.setFill(Color.YELLOW);
      c1.setOnMouseClicked(e ->{
    	  window.setScene(scene4);
    	  audilevel.play();
    	  audilevel.setCycleCount(audilevel.INDEFINITE);
    	  audiclip.stop();
    	  Alert wow=new Alert(AlertType.WARNING);
    	  wow.setHeaderText("Please read carefully before operating the game");
    	  wow.setContentText("Match the text color with the box ,if you got error,you must end game :(");
    	  wow.showAndWait();
    	  
      });
      label1.setOnMouseClicked(e ->{
    	  window.setScene(scene4);
    	  audilevel.play();
    	  audilevel.setCycleCount(audilevel.INDEFINITE);
    	  audiclip.stop();
    	  Alert wow=new Alert(AlertType.WARNING);
    	  wow.setHeaderText("Please read carefully before operating the game");
    	  wow.setContentText("Match the text color with the box ,if you got error,you must end game ,and you will failed :(");
    	  wow.showAndWait();
    	  
      });
    
      Label label2=new Label("Level 2");
      label2.setFont(Font.font(50));
      c2=new Circle(100);
      c2.setTranslateY(450);
      c2.setTranslateX(300);
      c2.setStroke(Color.BLACK);
      c2.setStrokeWidth(8);   
      c2.setFill(Color.BLUE);
      label2.setTranslateY(c2.getTranslateY()+70); 
      label2.setTranslateX(label1.getTranslateX());
      c2.setOnMouseClicked(e ->{
    	  window.setScene(scene6);
    	  audilevel.play();
    	  audilevel.setCycleCount(audilevel.INDEFINITE);
    	  audiclip.stop();
    	  Alert wow2=new Alert(AlertType.WARNING);
    	  wow2.setHeaderText("Please read carefully before operating the game");
    	  wow2.setContentText("Match the text color with the box ,if you got error,you must end game ,and you will failed,if you know java then it willbe easy for you! ,just match the colors");
    	  wow2.showAndWait();
    	  
      });
      label2.setOnMouseClicked(e ->{
    	  window.setScene(scene6);
    	  audilevel.play();
    	  audilevel.setCycleCount(audilevel.INDEFINITE);
    	  audiclip.stop();
    	  Alert wow3=new Alert(AlertType.WARNING);
    	  wow3.setHeaderText("Please read carefully before operating the game");
    	  wow3.setContentText("Match the text color with the box ,if you got error,you must end game ,and you will failed,if you know java then it willbe easy for you! ,just match the colors");
    	  wow3.showAndWait();
    	  
      });
      
      
      
      
      Label label3=new Label("Level 3");
      label3.setFont(Font.font(50));
      c3=new Circle(100);
      c3.setTranslateY(450);
      c3.setTranslateX(300);
      c3.setStroke(Color.BLACK);
      c3.setStrokeWidth(8);   
      c3.setFill(Color.RED);
      label3.setTranslateY(c3.getTranslateY()+70); 
      label3.setTranslateX(label3.getTranslateX()+105);
      c3.setOnMouseClicked(e ->{
    	  window.setScene(scene7);
    	  audilevel.play();
    	  audilevel.setCycleCount(audilevel.INDEFINITE);
    	  audiclip.stop();
    	  Alert wow4=new Alert(AlertType.WARNING);
    	  wow4.setHeaderText("Please read carefully before operating the game");
    	  wow4.setContentText("Match the text color with the box ,if you got error,you must end game,haha it is harder than you think");
    	  wow4.showAndWait();
    	  
      });
      label3.setOnMouseClicked(e ->{
    	  window.setScene(scene7);
    	  audilevel.play();
    	  audilevel.setCycleCount(audilevel.INDEFINITE);
    	  audiclip.stop();
    	  Alert wow=new Alert(AlertType.WARNING);
    	  wow.setHeaderText("Please read carefully before operating the game");
    	  wow.setContentText("Match the text color with the box ,if you got error,you must end game ,haha it is harder than you think");
    	  wow.showAndWait();
    	  
      });
      
      Label label4=new Label("Level 4");
      label4.setFont(Font.font(50));
      c4=new Circle(100);
      c4.setTranslateY(450);
      c4.setTranslateX(300);
      c4.setStroke(Color.BLACK);
      c4.setStrokeWidth(8);   
      c4.setFill(Color.GREEN);
      label4.setTranslateY(c4.getTranslateY()+70); 
      label4.setTranslateX(label3.getTranslateX());
      c4.setOnMouseClicked(e ->{
    	  window.setScene(scene8);
    	  audilevel.play();
    	  audilevel.setCycleCount(audilevel.INDEFINITE);
    	  audiclip.stop();
    	  Alert wow=new Alert(AlertType.WARNING);
    	  wow.setHeaderText("Please read carefully before operating the game");
    	  wow.setContentText("Match the text color with the box ,if you got error,are you getting difficulties ?,restart and play");
    	  wow.showAndWait();
    	  
      });
      label4.setOnMouseClicked(e ->{
    	  window.setScene(scene8);
    	  audilevel.play();
    	  audilevel.setCycleCount(audilevel.INDEFINITE);
    	  audiclip.stop();
    	  Alert wow=new Alert(AlertType.WARNING);
    	  wow.setHeaderText("Please read carefully before operating the game");
    	  wow.setContentText("Match the text color with the box ,if you got error,are you getting difficulties ?,restart and play");
    	  wow.showAndWait();
    	  
      });
      
      
      hbox2.getChildren().addAll(c1,label1,c2,label2,c3,label3,c4,label4);
      
      menuhead1=new Label("Blocky");
      menuhead2=new Label("Land");
      
      menuhead1.setFont(Font.font("Times New Roman", 150));
      menuhead1.setTranslateX(550);
      menuhead1.setTextFill(Color.BLUE);
      menuhead1.setOpacity(0);
      menuhead2.setFont(Font.font("Times New Roman", 150));
      menuhead2.setTranslateX(1050);
      menuhead2.setTranslateY(-170);
      menuhead2.setTextFill(Color.GREEN);
      menuhead2.setOpacity(0);
      
      //fading transitions
      fademenuhead1=new FadeTransition();
      fademenuhead2=new FadeTransition();
      
      fadelevel1=new FadeTransition();
      fadelevel2=new FadeTransition();
      fadelevel3=new FadeTransition();
      fadelevel4=new FadeTransition();
      
      fademenuhead1.setOnFinished(e ->{
    	  fadelevel1();
    	  fadelevel2();
    	  fadelevel3();
    	  fadelevel4();
      });
      
      
      c1.setOpacity(0);
      c2.setOpacity(0);
      c3.setOpacity(0);
      c4.setOpacity(0);
      vbox1.getChildren().addAll(hbox1,hbox2,menuhead1,menuhead2);
      
      
      layout3=new Group();
      layout3.getChildren().addAll(imview,vbox1);
      scene3=new Scene(layout3,resx,resy);
      
        //designing level 1 
      
      
      //setting audio 
      filelevels=new File("C:\\Users\\umars\\OneDrive\\Documents\\Blocky Game\\media\\audiolevels.mp3");
      audilevel=new AudioClip(filelevels.toURI().toURL().toString());
      
      
      layout4=new Group();
      Label bl1=new Label("public class BlockyLand{");
      bl1.setFont(Font.font("Times New Roman",30));
      bl1.setTranslateY(330);
      bl1.setTranslateX(1400);
      bl1.setTextFill(Color.BLUE);
     
      
      Label bl2=new Label("public static void main(String[] args){");
      bl2.setFont(Font.font("Times New Roman",30));
      bl2.setTranslateY(330);
      bl2.setTranslateX(1400);
      bl2.setTextFill(Color.PURPLE);
      
      Label bl3=new Label("System.out.println(\"Level 1 Completed!\");}}");
      bl3.setFont(Font.font("Times New Roman",30));
      bl3.setTranslateY(330);
      bl3.setTranslateX(1400);
      bl3.setTextFill(Color.BROWN);
      

      
      VBox level1box=new VBox(100);
      level1box.getChildren().addAll(bl3,bl2,bl1);
  
      
      Rectangle rec1=new Rectangle(700,80);
      rec1.setFill(Color.WHITE);
      rec1.setStroke(Color.BLUE);
      rec1.setStrokeWidth(7);
      rec1.setArcHeight(50);
      rec1.setArcWidth(50);
      rec1.setTranslateX(600);
      rec1.setTranslateY(300);
      Label target1=new Label("target target target target target target target");
      target1.setFont(Font.font("Times New Roman",30));
      target1.setTranslateX(700);
      target1.setTranslateY(330);
      target1.setOpacity(0);
      
      Rectangle rec2=new Rectangle(700,80);
      rec2.setFill(Color.WHITE);
      rec2.setStroke(Color.PURPLE);
      rec2.setStrokeWidth(7);
      rec2.setArcHeight(50);
      rec2.setArcWidth(50);
      rec2.setTranslateX(600);
      rec2.setTranslateY(300);
      Label target2=new Label("target target target target target target target");
      target2.setFont(Font.font("Times New Roman",30));
      target2.setTranslateX(700);
      target2.setTranslateY(330);
      target2.setOpacity(0);

      
      Rectangle rec3=new Rectangle(700,80);
      rec3.setFill(Color.WHITE);
      rec3.setStroke(Color.BROWN);
      rec3.setStrokeWidth(7);
      rec3.setTranslateX(600);
      rec3.setArcHeight(50);
      rec3.setArcWidth(50);
      rec3.setTranslateY(300);
      Label target3=new Label("target target target target target target target");
      target3.setFont(Font.font("Times New Roman",30));
      target3.setTranslateX(700);
      target3.setTranslateY(330);
      target3.setOpacity(0);

      VBox level1box2=new VBox(50);
      level1box2.getChildren().addAll(rec1,rec2,rec3);
      
      
      
      //media level completed
      filelvlcom =new File("C:\\Users\\umars\\OneDrive\\Documents\\Blocky Game\\media\\level_completed.mp4");
      Media media2=new Media(filelvlcom.toURI().toURL().toString());
	    MediaPlayer medplay2=new MediaPlayer(media2);
      MediaView medview2=new MediaView(medplay2);
      
      File filelvlnotcom =new File("C:\\Users\\umars\\OneDrive\\Documents\\Blocky Game\\media\\levelnotcomplete.mp4");
      Media media3=new Media(filelvlnotcom.toURI().toURL().toString());
	     medplay3=new MediaPlayer(media3);
      MediaView medview3=new MediaView(medplay3);
      
    drag1(bl1,target1,rec1,rec2,rec3);
    drag2(bl2,target2,rec1,rec2,rec3);
    drag3(bl3,target3,rec1,rec2,rec3);
      
      VBox level1box3=new VBox(100);
      level1box3.getChildren().addAll(target1,target2,target3);
      
      layoutlvl=new StackPane();
      
      Button endgame=new Button("BACK TO MENU");
      endgame.setTranslateX(100);
      endgame.setTranslateY(400);
      endgame.setFont(Font.font(30));
      endgame.setTextFill(Color.CYAN);
      endgame.setOnAction(e ->{
    	  window.setScene(scene3);
    	  window.setFullScreen(true);
    	  audilevel.stop();
      });
      
Text main=new Text("Beginners");
      main.setFont(Font.font(110));
      main.setTranslateY(200);
      main.setStroke(Color.DARKRED);
      main.setFill(Color.YELLOW);
      main.setTranslateX(700);
      main.setStrokeWidth(3);
      
      Button submit=new Button("Submit");
      submit.setTranslateX(100);
      submit.setTranslateY(400);
      submit.setFont(Font.font(30));
      submit.setTextFill(Color.CYAN);
      submit.setOnAction(e ->{
    	  if(key==true) {
    		 
    		  layoutlvl.getChildren().addAll(medview2);
    		  window.setScene(scene5);
    		  window.setFullScreen(true); 
    		  audilevel.stop();
    		  medplay2.play();		  
    		  
    	  }
    	  else {
    	      layoutlvl.getChildren().addAll(medview3);
    	      window.setScene(scene5);
    		  window.setFullScreen(true); 
    		  audilevel.stop();
    		  medplay3.play();
    		  
    	  }
      });
      VBox button=new VBox(50);
      button.getChildren().addAll(endgame,submit);
     
      
      
      layout4.getChildren().addAll(level1box2,level1box,level1box3,button,main);
     
      scene4=new Scene(layout4,resx,resy);
      
     medview2.setOnMouseClicked(e ->{
    	 window.setScene(scene3);
   	  window.setFullScreen(true);
   	  audilevel.stop();
   	  medplay2.stop();
     });
     medview3.setOnMouseClicked(e ->{
    	 window.setScene(scene3);
   	  window.setFullScreen(true);
   	  audilevel.stop();
   	medplay3.stop();
     });
   

     
     scene5=new Scene(layoutlvl,resx,resy);
    
     
     //designing level 2
     Label bll1=new Label("public class BlockyLand{");
     bll1.setFont(Font.font("Times New Roman",30));
     bll1.setTranslateY(330);
     bll1.setTranslateX(1400);
     bll1.setTextFill(Color.BLUE);
    
     
     Label bll2=new Label("public static void main(String[] args){");
     bll2.setFont(Font.font("Times New Roman",30));
     bll2.setTranslateY(330);
     bll2.setTranslateX(1400);
     bll2.setTextFill(Color.PURPLE);
     
     Label bll3=new Label("System.out.println(\"Add A+B\");");
     bll3.setFont(Font.font("Times New Roman",30));
     bll3.setTranslateY(330);
     bll3.setTranslateX(1400);
     bll3.setTextFill(Color.BROWN);
     
 
     Label bll4=new Label("System.out.println(\"Sum of A+B is ::\");}}");
     bll4.setFont(Font.font("Times New Roman",30));
     bll4.setTranslateY(330);
     bll4.setTranslateX(1400);
     bll4.setTextFill(Color.BLACK);
     
     VBox vbox11=new VBox(100);
     vbox11.getChildren().addAll(bll4,bll3,bll1,bll2);
     
     Rectangle rec11=new Rectangle(700,80);
     rec11.setFill(Color.WHITE);
     rec11.setStroke(Color.BLUE);
     rec11.setStrokeWidth(7);
     rec11.setArcHeight(50);
     rec11.setArcWidth(50);
     rec11.setTranslateX(600);
     rec11.setTranslateY(300);
     Label target11=new Label("target target target target target target target");
     target11.setFont(Font.font("Times New Roman",30));
     target11.setTranslateX(700);
     target11.setTranslateY(330);
     target11.setOpacity(0);
     
     Rectangle rec12=new Rectangle(700,80);
     rec12.setFill(Color.WHITE);
     rec12.setStroke(Color.PURPLE);
     rec12.setStrokeWidth(7);
     rec12.setArcHeight(50);
     rec12.setArcWidth(50);
     rec12.setTranslateX(600);
     rec12.setTranslateY(300);
     Label target12=new Label("target target target target target target target");
     target12.setFont(Font.font("Times New Roman",30));
     target12.setTranslateX(700);
     target12.setTranslateY(330);
     target12.setOpacity(0);

     
     Rectangle rec13=new Rectangle(700,80);
     rec13.setFill(Color.WHITE);
     rec13.setStroke(Color.BROWN);
     rec13.setStrokeWidth(7);
     rec13.setTranslateX(600);
     rec13.setArcHeight(50);
     rec13.setArcWidth(50);
     rec13.setTranslateY(300);
     Label target13=new Label("target target target target target target target");
     target13.setFont(Font.font("Times New Roman",30));
     target13.setTranslateX(700);
     target13.setTranslateY(330);
     target13.setOpacity(0);
     
     
     Rectangle rec14=new Rectangle(700,80);
     rec14.setFill(Color.WHITE);
     rec14.setStroke(Color.BLACK);
     rec14.setStrokeWidth(7);
     rec14.setTranslateX(600);
     rec14.setArcHeight(50);
     rec14.setArcWidth(50);
     rec14.setTranslateY(300);
     Label target14=new Label("target target target target target target target");
     target14.setFont(Font.font("Times New Roman",30));
     target14.setTranslateX(700);
     target14.setTranslateY(330);
     target14.setOpacity(0);
     
     VBox vbox12=new VBox(50);
     VBox vbox13=new VBox(100);
     
     vbox12.getChildren().addAll(rec11,rec12,rec13,rec14);
     
     vbox13.getChildren().addAll(target11,target12,target13,target14);
     
     drag12(bll1,target11,rec11,rec12,rec13,rec14);
     drag13(bll2,target12,rec11,rec12,rec13,rec14);
     drag14(bll3,target13,rec11,rec12,rec13,rec14);
     drag15(bll4,target14,rec11,rec12,rec13,rec14);
     
     
     Text main2=new Text("Easy");
     main2.setFont(Font.font(110));
     main2.setTranslateY(200);
     main2.setStroke(Color.DARKRED);
     main2.setFill(Color.YELLOW);
     main2.setTranslateX(900);
     main2.setStrokeWidth(3);
     
     
     Button submit2=new Button("Submit");
     submit2.setTranslateX(100);
     submit2.setTranslateY(400);
     submit2.setFont(Font.font(30));
     submit2.setTextFill(Color.CYAN);
     submit2.setOnAction(e ->{
   	  if(key2==true) {
   		 
   		  layoutlvl2.getChildren().addAll(medview2);
   		  window.setScene(scene51);
   		  window.setFullScreen(true); 
   		  audilevel.stop();
   		  medplay2.play();		  
   		  
   	  }
   	  else {
   	      layoutlvl2.getChildren().addAll(medview3);
   	      window.setScene(scene51);
   		  window.setFullScreen(true); 
   		  audilevel.stop();
   		  medplay3.play();
   		  
   	  }
     });
     layoutlvl2=new StackPane();
     scene51=new Scene(layoutlvl2,resx,resy);
     Button endgame2=new Button("BACK TO MENU");
     endgame2.setTranslateX(100);
     endgame2.setTranslateY(400);
     endgame2.setFont(Font.font(30));
     endgame2.setTextFill(Color.CYAN);
     endgame2.setOnAction(e ->{
   	  window.setScene(scene3);
   	  window.setFullScreen(true);
   	  audilevel.stop();
     });
     
     VBox button2=new VBox(50);
     button2.getChildren().addAll(endgame2,submit2);
     
     Group layoutgroup=new Group();
     
     layoutgroup.getChildren().addAll(vbox11,vbox12,vbox13,button2,main2);
     
   scene6=new Scene(layoutgroup,resx,resy);
   
   //designing level 3
   Label bl21=new Label("public class BlockyLand{");
   bl21.setFont(Font.font("Times New Roman",30));
   bl21.setTranslateY(330);
   bl21.setTranslateX(1400);
   bl21.setTextFill(Color.BLUE);
  
   
   Label bl22=new Label("public static void main(String[] args){");
   bl22.setFont(Font.font("Times New Roman",30));
   bl22.setTranslateY(330);
   bl22.setTranslateX(1400);
   bl22.setTextFill(Color.PURPLE);
   
   Label bl23=new Label("System.out.println(\"Level 3 is harder\");");
   bl23.setFont(Font.font("Times New Roman",30));
   bl23.setTranslateY(330);
   bl23.setTranslateX(1400);
   bl23.setTextFill(Color.BROWN);
   

   Label bl24=new Label("System.out.println(\"Can anyone complete it!\");");
   bl24.setFont(Font.font("Times New Roman",30));
   bl24.setTranslateY(330);
   bl24.setTranslateX(1400);
   bl24.setTextFill(Color.BLACK);
   
   
   Label bl25=new Label("System.out.println(\"Level 3 Completed!\");}}");
   bl25.setFont(Font.font("Times New Roman",30));
   bl25.setTranslateY(330);
   bl25.setTranslateX(1400);
   bl25.setTextFill(Color.DARKGREEN);
   
   VBox vbox21=new VBox(100);
   vbox21.getChildren().addAll(bl23,bl24,bl22,bl21,bl25);
   
   Rectangle rec21=new Rectangle(700,80);
   rec21.setFill(Color.WHITE);
   rec21.setStroke(Color.BLUE);
   rec21.setStrokeWidth(7);
   rec21.setArcHeight(50);
   rec21.setArcWidth(50);
   rec21.setTranslateX(600);
   rec21.setTranslateY(300);
   Label target21=new Label("target target target target target target target");
   target21.setFont(Font.font("Times New Roman",30));
   target21.setTranslateX(700);
   target21.setTranslateY(330);
   target21.setOpacity(0);
   
   Rectangle rec22=new Rectangle(700,80);
   rec22.setFill(Color.WHITE);
   rec22.setStroke(Color.PURPLE);
   rec22.setStrokeWidth(7);
   rec22.setArcHeight(50);
   rec22.setArcWidth(50);
   rec22.setTranslateX(600);
   rec22.setTranslateY(300);
   Label target22=new Label("target target target target target target target");
   target22.setFont(Font.font("Times New Roman",30));
   target22.setTranslateX(700);
   target22.setTranslateY(330);
   target22.setOpacity(0);

   
   Rectangle rec23=new Rectangle(700,80);
   rec23.setFill(Color.WHITE);
   rec23.setStroke(Color.BROWN);
   rec23.setStrokeWidth(7);
   rec23.setTranslateX(600);
   rec23.setArcHeight(50);
   rec23.setArcWidth(50);
   rec23.setTranslateY(300);
   Label target23=new Label("target target target target target target target");
   target23.setFont(Font.font("Times New Roman",30));
   target23.setTranslateX(700);
   target23.setTranslateY(330);
   target23.setOpacity(0);
   
   
   Rectangle rec24=new Rectangle(700,80);
   rec24.setFill(Color.WHITE);
   rec24.setStroke(Color.BLACK);
   rec24.setStrokeWidth(7);
   rec24.setTranslateX(600);
   rec24.setArcHeight(50);
   rec24.setArcWidth(50);
   rec24.setTranslateY(300);
   Label target24=new Label("target target target target target target target");
   target24.setFont(Font.font("Times New Roman",30));
   target24.setTranslateX(700);
   target24.setTranslateY(330);
   target24.setOpacity(0);
   
   Rectangle rec25=new Rectangle(700,80);
   rec25.setFill(Color.WHITE);
   rec25.setStroke(Color.DARKGREEN);
   rec25.setStrokeWidth(7);
   rec25.setTranslateX(600);
   rec25.setArcHeight(50);
   rec25.setArcWidth(50);
   rec25.setTranslateY(300);
   Label target25=new Label("target target target target target target target");
   target25.setFont(Font.font("Times New Roman",30));
   target25.setTranslateX(700);
   target25.setTranslateY(330);
   target25.setOpacity(0);
   
   VBox vbox22=new VBox(50);
   VBox vbox23=new VBox(100);
   
   vbox22.getChildren().addAll(rec21,rec22,rec23,rec24,rec25);
   
   vbox23.getChildren().addAll(target21,target22,target23,target24,target25);
   
   
   drag122(bl21, target21, rec21, rec22, rec23, rec24, rec25);
   drag123(bl22, target22, rec21, rec22, rec23, rec24, rec25);
   drag124(bl23, target23, rec21, rec22, rec23, rec24, rec25);
   drag125(bl24, target24, rec21, rec22, rec23, rec24, rec25);
   drag126(bl25, target25, rec21, rec22, rec23, rec24, rec25);
   
   Text main3=new Text("Medium");
   main3.setFont(Font.font(110));
   main3.setTranslateY(200);
   main3.setStroke(Color.DARKRED);
   main3.setFill(Color.YELLOW);
   main3.setTranslateX(800);
   main3.setStrokeWidth(3);
   
   
   Button submit3=new Button("Submit");
   submit3.setTranslateX(100);
   submit3.setTranslateY(400);
   submit3.setFont(Font.font(30));
   submit3.setTextFill(Color.CYAN);
   submit3.setOnAction(e ->{
	   	  if(key3==true) {
	   		 
	   		  layoutlvl3.getChildren().addAll(medview2);
	   		  window.setScene(scene52);
	   		  window.setFullScreen(true); 
	   		  audilevel.stop();
	   		  medplay2.play();		  
	   		  
	   	  }
	   	  else {
	   	      layoutlvl3.getChildren().addAll(medview3);
	   	      window.setScene(scene52);
	   		  window.setFullScreen(true); 
	   		  audilevel.stop();
	   		  medplay3.play();
	   		  
	   	  }
	     });
   layoutlvl3=new StackPane();
   scene52=new Scene(layoutlvl3,resx,resy);
   Button endgame3=new Button("BACK TO MENU");
   endgame3.setTranslateX(100);
   endgame3.setTranslateY(400);
   endgame3.setFont(Font.font(30));
   endgame3.setTextFill(Color.CYAN);
   endgame3.setOnAction(e ->{
 	  window.setScene(scene3);
 	  window.setFullScreen(true);
 	  audilevel.stop();
   });
   
   VBox button3=new VBox(50);
   button3.getChildren().addAll(endgame3,submit3);
   
   Group layoutgroup3=new Group();
   
   layoutgroup3.getChildren().addAll(vbox21,vbox22,vbox23,button3,main3);
   
   
  scene7=new Scene(layoutgroup3,resx,resy);
   
   //designing level 4
  Label b31=new Label("public class BlockyLand{");
  b31.setFont(Font.font("Times New Roman",30));
  b31.setTranslateY(330);
  b31.setTranslateX(1400);
  b31.setTextFill(Color.BLUE);
 
  
  Label bl32=new Label("public static void main(String[] args){");
  bl32.setFont(Font.font("Times New Roman",30));
  bl32.setTranslateY(330);
  bl32.setTranslateX(1400);
  bl32.setTextFill(Color.PURPLE);
  
  Label bl33=new Label("System.out.println(\"Where there is a\");}}");
  bl33.setFont(Font.font("Times New Roman",30));
  bl33.setTranslateY(330);
  bl33.setTranslateX(1400);
  bl33.setTextFill(Color.BROWN);
  

  Label bl34=new Label("System.out.println(\"will,there is a way\");}}");
  bl34.setFont(Font.font("Times New Roman",30));
  bl34.setTranslateY(330);
  bl34.setTranslateX(1400);
  bl34.setTextFill(Color.BLACK);
  
  
  Label bl35=new Label("System.out.println(\"getting to beat it\");}}");
  bl35.setFont(Font.font("Times New Roman",30));
  bl35.setTranslateY(330);
  bl35.setTranslateX(1400);
  bl35.setTextFill(Color.DARKGREEN);
  
  Label bl36=new Label("System.out.println(\"Do you like Blocky!\");}}");
  bl36.setFont(Font.font("Times New Roman",30));
  bl36.setTranslateY(330);
  bl36.setTranslateX(1400);
  bl36.setTextFill(Color.GRAY);
 
  VBox vbox31=new VBox(100);
  vbox31.getChildren().addAll(bl36,bl34,bl33,bl35,b31,bl32);
  
  Rectangle rec31=new Rectangle(700,80);
  rec31.setFill(Color.WHITE);
  rec31.setStroke(Color.BLUE);
  rec31.setStrokeWidth(7);
  rec31.setArcHeight(50);
  rec31.setArcWidth(50);
  rec31.setTranslateX(600);
  rec31.setTranslateY(300);
  Label target31=new Label("target target target target target target target");
  target31.setFont(Font.font("Times New Roman",30));
  target31.setTranslateX(700);
  target31.setTranslateY(330);
  target31.setOpacity(0);
  
  Rectangle rec32=new Rectangle(700,80);
  rec32.setFill(Color.WHITE);
  rec32.setStroke(Color.PURPLE);
  rec32.setStrokeWidth(7);
  rec32.setArcHeight(50);
  rec32.setArcWidth(50);
  rec32.setTranslateX(600);
  rec32.setTranslateY(300);
  Label target32=new Label("target target target target target target target");
  target32.setFont(Font.font("Times New Roman",30));
  target32.setTranslateX(700);
  target32.setTranslateY(330);
  target32.setOpacity(0);

  
  Rectangle rec33=new Rectangle(700,80);
  rec33.setFill(Color.WHITE);
  rec33.setStroke(Color.BROWN);
  rec33.setStrokeWidth(7);
  rec33.setTranslateX(600);
  rec33.setArcHeight(50);
  rec33.setArcWidth(50);
  rec33.setTranslateY(300);
  Label target33=new Label("target target target target target target target");
  target33.setFont(Font.font("Times New Roman",30));
  target33.setTranslateX(700);
  target33.setTranslateY(330);
  target33.setOpacity(0);
  
  
  Rectangle rec34=new Rectangle(700,80);
  rec34.setFill(Color.WHITE);
  rec34.setStroke(Color.BLACK);
  rec34.setStrokeWidth(7);
  rec34.setTranslateX(600);
  rec34.setArcHeight(50);
  rec34.setArcWidth(50);
  rec34.setTranslateY(300);
  Label target34=new Label("target target target target target target target");
  target34.setFont(Font.font("Times New Roman",30));
  target34.setTranslateX(700);
  target34.setTranslateY(330);
  target34.setOpacity(0);
  
  Rectangle rec35=new Rectangle(700,80);
  rec35.setFill(Color.WHITE);
  rec35.setStroke(Color.DARKGREEN);
  rec35.setStrokeWidth(7);
  rec35.setTranslateX(600);
  rec35.setArcHeight(50);
  rec35.setArcWidth(50);
  rec35.setTranslateY(300);
  Label target35=new Label("target target target target target target target");
  target35.setFont(Font.font("Times New Roman",30));
  target35.setTranslateX(700);
  target35.setTranslateY(330);
  target35.setOpacity(0);
  
  Rectangle rec36=new Rectangle(700,80);
  rec36.setFill(Color.WHITE);
  rec36.setStroke(Color.GREY);
  rec36.setStrokeWidth(7);
  rec36.setTranslateX(600);
  rec36.setArcHeight(50);
  rec36.setArcWidth(50);
  rec36.setTranslateY(300);
  Label target36=new Label("target target target target target target target");
  target36.setFont(Font.font("Times New Roman",30));
  target36.setTranslateX(700);
  target36.setTranslateY(330);
  target36.setOpacity(0);
  
  VBox vbox32=new VBox(50);
  VBox vbox33=new VBox(100);
  
  vbox32.getChildren().addAll(rec31,rec32,rec33,rec34,rec35,rec36);
  
  vbox33.getChildren().addAll(target31,target32,target33,target34,target35,target36);
  
  drag132(b31,target31,rec31,rec32,rec33,rec34,rec35,rec36);
  drag133(bl32,target32,rec31,rec32,rec33,rec34,rec35,rec36);
  drag134(bl33,target33,rec31,rec32,rec33,rec34,rec35,rec36);
  drag135(bl34,target34,rec31,rec32,rec33,rec34,rec35,rec36);
  drag136(bl35,target35,rec31,rec32,rec33,rec34,rec35,rec36);
  drag137(bl36,target36,rec31,rec32,rec33,rec34,rec35,rec36);
  
  
  Text main4=new Text("Hard");
  main4.setFont(Font.font(110));
  main4.setTranslateY(200);
  main4.setStroke(Color.DARKRED);
  main4.setFill(Color.YELLOW);
  main4.setTranslateX(900);
  main4.setStrokeWidth(3);
  
  
  Button submit4=new Button("Submit");
  submit4.setTranslateX(100);
  submit4.setTranslateY(400);
  submit4.setFont(Font.font(30));
  submit4.setTextFill(Color.CYAN);
  submit4.setOnAction(e ->{
   	  if(key4==true) {
   		 
   		  layoutlvl4.getChildren().addAll(medview2);
   		  window.setScene(scene53);
   		  window.setFullScreen(true); 
   		  audilevel.stop();
   		  medplay2.play();		  
   		  
   	  }
   	  else {
   	      layoutlvl4.getChildren().addAll(medview3);
   	      window.setScene(scene53);
   		  window.setFullScreen(true); 
   		  audilevel.stop();
   		  medplay3.play();
   		  
   	  }
     });
  layoutlvl4=new StackPane();
  scene53=new Scene(layoutlvl4,resx,resy);
  
  
  Button endgame4=new Button("BACK TO MENU");
  endgame4.setTranslateX(100);
  endgame4.setTranslateY(400);
  endgame4.setFont(Font.font(30));
  endgame4.setTextFill(Color.CYAN);
  endgame4.setOnAction(e ->{
	  window.setScene(scene3);
	  window.setFullScreen(true);
	  audilevel.stop();
  });
  
  VBox button4=new VBox(50);
  button4.getChildren().addAll(endgame4,submit4);
  
  Group layoutgroup4=new Group();
  
  layoutgroup4.getChildren().addAll(vbox31,vbox32,vbox33,button4,main4);
  
  
 scene8=new Scene(layoutgroup4,resx,resy);
  
  
  
  
   
   
        window.setFullScreen(true);
        window.setScene(scene);
        window.show();
  
        
    }
    
 
    
    
    void fade() {
		fade.setDuration(Duration.seconds(2));
		fade.setNode(layout);
		fade.setFromValue(0);
		fade.setToValue(2);
		fade.play();
	}
    void fade2() {
    	//loading animation
        fade2.setCycleCount(4);
        fade2.setAutoReverse(true);
		fade2.setDuration(Duration.seconds(2));
		fade2.setNode(text);
		fade2.setFromValue(0);
		fade2.setToValue(2);   
                fade2.play();
	}
    void fade3() {
    	//click to start animation
        fade3.setCycleCount(200);
        fade3.setAutoReverse(true);
        fade3.setDelay(Duration.seconds(22));
		fade3.setDuration(Duration.seconds(1));
		fade3.setNode(text2);
		fade3.setFromValue(0);
		fade3.setToValue(2);
		fade3.play();
	}
    //menu fade
     void fade4() {
         
		fade4.setDuration(Duration.seconds(3));
		fade4.setNode(layout3);
		fade4.setFromValue(0);
		fade4.setToValue(2);
		fade4.play();
	}
     void fademenuheading1() {
        
    	fademenuhead1.setDelay(Duration.seconds(2)); 
    	fademenuhead1.setDuration(Duration.seconds(2));
    	fademenuhead1.setNode(menuhead1);
        fademenuhead1.setFromValue(0);
    	fademenuhead1.setToValue(2);
    	fademenuhead1.play();
 	}
     void fademenuheading2() {
        
    	fademenuhead2.setDelay(Duration.seconds(3)); 
     	fademenuhead2.setDuration(Duration.seconds(2));
     	fademenuhead2.setNode(menuhead2);
        fademenuhead2.setFromValue(0);
     	fademenuhead2.setToValue(2);
     	fademenuhead2.play();
  	}
     void fadelevel1() {
    	fadelevel1.setCycleCount(200); 
    	fadelevel1.setAutoReverse(true); 
    	fadelevel1.setDelay(Duration.seconds(0)); 
 		fadelevel1.setDuration(Duration.seconds(2));
 		fadelevel1.setNode(c1);
 		fadelevel1.setFromValue(0);
 		fadelevel1.setToValue(2);
 		fadelevel1.play();
 	}
     void fadelevel2() {
    	fadelevel2.setCycleCount(200); 
     	fadelevel2.setAutoReverse(true); 
    	fadelevel2.setDelay(Duration.seconds(.5)); 
  		fadelevel2.setDuration(Duration.seconds(2));
  		fadelevel2.setNode(c2);
  		fadelevel2.setFromValue(0);
  		fadelevel2.setToValue(2);
  		fadelevel2.play();
  	}
     void fadelevel3() {
    	fadelevel3.setCycleCount(200); 
     	fadelevel3.setAutoReverse(true);
    	fadelevel3.setDelay(Duration.seconds(1));
  		fadelevel3.setDuration(Duration.seconds(2));
  		fadelevel3.setNode(c3);
  		fadelevel3.setFromValue(0);
  		fadelevel3.setToValue(2);
  		fadelevel3.play();
  	}
     void fadelevel4() {
    	fadelevel4.setCycleCount(200); 
     	fadelevel4.setAutoReverse(true); 
    	fadelevel4.setDelay(Duration.seconds(1.5)); 
  		fadelevel4.setDuration(Duration.seconds(2));
  		fadelevel4.setNode(c4);
  		fadelevel4.setFromValue(0);
  		fadelevel4.setToValue(2);
  		fadelevel4.play();
  	}
     //level1
void drag1(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3) {
  	   bl1=t;
  	   target1=r;
  	   rec1=r1;
  	   rec2=r2;
  	   rec3=r3;
  	   bl1.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = bl1.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(bl1.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans=true;
  		       }
  		       else {
  		     	  ans=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans3==false&&ans==true&&ans2==false) {
  		       rec1.setFill(Color.LIGHTGREEN);
  		      Score+=5.5;
  		       }else {
  		     	  rec2.setFill(Color.ORANGERED);
  		     	  rec3.setFill(Color.ORANGERED);
  		     	 
  		       
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       bl1.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans==true) {
  		           bl1.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
void drag2(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3) {
  	   bl2=t;
  	   target2=r;
  	   rec1=r1;
  	   rec2=r2;
  	   rec3=r3;
  	   bl2.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = bl2.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(bl2.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans2=true;
  		       }
  		       else {
  		     	  ans2=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans3==false&&ans==true&&ans2==true) {
  		       rec2.setFill(Color.LIGHTGREEN);
  		     Score+=5.5;
  		       }else {
  		     	  rec3.setFill(Color.ORANGERED);
  		     	  rec1.setFill(Color.ORANGERED);
  		     	 
  		       
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       bl2.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans2==true) {
  		           bl2.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
void drag3(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3) {
	   bl3=t;
	   target3=r;
	   rec1=r1;
	   rec2=r2;
	   rec3=r3;
	   bl3.setOnDragDetected(new EventHandler<MouseEvent>() {
		   public void handle(MouseEvent event) {
		       /* drag was detected, start a drag-and-drop gesture*/
		       /* allow any transfer mode */
		       Dragboard db = bl3.startDragAndDrop(TransferMode.ANY);
		       
		       /* Put a string on a dragboard */
		       ClipboardContent content = new ClipboardContent();
		       content.putString(bl3.getText());
		       db.setContent(content);
		       
		       event.consume();
		   }
		 });
		       r.setOnDragOver(new EventHandler<DragEvent>() {
		   public void handle(DragEvent event) {
		       /* data is dragged over the target */
		       /* accept it only if it is not dragged from the same node 
		        * and if it has a string data */
		       if (event.getGestureSource() != r &&
		               event.getDragboard().hasString()) {
		           /* allow for both copying and moving, whatever user chooses */
		           event.acceptTransferModes(TransferMode.MOVE);
		           ans3=true;
		       }
		       else {
		     	  ans3=false;
		       }
		       
		       event.consume();
		   }
		 });
		       r.setOnDragEntered(new EventHandler<DragEvent>() {
		   public void handle(DragEvent event) {
		   /* the drag-and-drop gesture entered the target */
		   /* show to the user that it is an actual gesture target */
		        if (event.getGestureSource() != r &&
		                event.getDragboard().hasString()) {
		            r.setTextFill(Color.BLACK);
		        }
		               
		        event.consume();
		   }
		 });
		       
		       r.setOnDragExited(new EventHandler<DragEvent>() {
		   public void handle(DragEvent event) {
		       /* mouse moved away, remove the graphical cues */
		       r.setTextFill(Color.BLACK);
		       if(ans3==true&&ans==true&&ans2==true) {
		       rec3.setFill(Color.LIGHTGREEN);
		       key=true;
		       Score+=5.5;
		       }else {
		     	  rec2.setFill(Color.ORANGERED);
		     	  rec1.setFill(Color.ORANGERED);
		     	 
		       
		       }
		       event.consume();
		   }
		 });
		       
		       r.setOnDragDropped(new EventHandler<DragEvent>() {
		   public void handle(DragEvent event) {
		       /* data dropped */
		       /* if there is a string data on dragboard, read it and use it */
		       Dragboard db = event.getDragboard();
		       boolean success = false;
		       if (db.hasString()) {
		          r.setText(db.getString());
		          success = true;
		       }
		       /* let the source know whether the string was successfully 
		        * transferred and used */
		       event.setDropCompleted(success);
		       
		       event.consume();
		    }
		 });
		       
		       bl3.setOnDragDone(new EventHandler<DragEvent>() {
		   public void handle(DragEvent event) {
		       /* the drag and drop gesture ended */
		       /* if the data was successfully moved, clear it */
		       if (event.getTransferMode() == TransferMode.MOVE&&ans3==true) {
		           bl3.setText("");
		           r.setOpacity(1);
		       }
		       event.consume();
		   }
		 });
   }

   //level2
   void drag12(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3,Rectangle r4) {
  	   bll1=t;
  	   targetl1=r;
  	   rec11=r1;
  	   rec12=r2;
  	   rec13=r3;
  	 rec14=r4;
  	   bll1.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = bll1.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(bll1.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans22=true;
  		       }
  		       else {
  		     	  ans22=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans23==false&&ans22==true&&ans24==false&&ans25==false) {
  		       rec11.setFill(Color.LIGHTGREEN);
  		     Score+=10;
  		       }else {
  		     	  rec12.setFill(Color.ORANGERED);
  		     	  rec13.setFill(Color.ORANGERED);
  		     	 rec14.setFill(Color.ORANGERED);
  		       
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       bll1.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans22==true) {
  		           bll1.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
   void drag13(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3,Rectangle r4) {
  	   bll2=t;
  	   targetl2=r;
  	   rec11=r1;
  	   rec11=r2;
  	   rec13=r3;
  	 rec14=r4;
  	   bll2.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = bll2.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(bll2.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans23=true;
  		       }
  		       else {
  		     	  ans23=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans23==true&&ans22==true&&ans24==false&&ans25==false) {
  		       rec12.setFill(Color.LIGHTGREEN);
  		     Score+=10;
  		       }else {
  		     	  rec11.setFill(Color.ORANGERED);
  		     	rec13.setFill(Color.ORANGERED);
  		     	rec14.setFill(Color.ORANGERED);

  		     	  
  		     	 
  		       
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       bll2.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans23==true) {
  		           bll2.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
   void drag14(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3,Rectangle r4) {
  	   bll3=t;
  	   targetl3=r;
  	   rec11=r1;
  	   rec12=r2;
  	   rec13=r3;
  	 rec14=r4;
  	   bll3.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = bll3.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(bll3.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans24=true;
  		       }
  		       else {
  		     	  ans24=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans23==true&&ans22==true&&ans24==true&&ans25==false) {
  		       rec13.setFill(Color.LIGHTGREEN);
  		      
  		       }else {
  		     	  rec11.setFill(Color.ORANGERED);
  		     	  rec12.setFill(Color.ORANGERED);
  		     	rec14.setFill(Color.ORANGERED);
  		     	 
  		       
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       bll3.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans24==true) {
  		           bll3.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
   void drag15(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3,Rectangle r4) {
  	   bll4=t;
  	   targetl4=r;
  	   rec11=r1;
  	   rec12=r2;
  	   rec13=r3;
  	 rec14=r4;
  	   bll4.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = bll4.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(bll4.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans25=true;
  		       }
  		       else {
  		     	  ans25=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans23==true&&ans22==true&&ans24==true&&ans25==true) {
  		       rec14.setFill(Color.LIGHTGREEN);
  		      key2=true;
  		    Score+=10;
  		       }else {
  		     	  rec12.setFill(Color.ORANGERED);
  		     	  rec13.setFill(Color.ORANGERED);
  		     	rec11.setFill(Color.ORANGERED);  		     	 
  		       
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       bll4.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans25==true) {
  		           bll4.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
    
   
   //level3
   void drag122(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3,Rectangle r4,Rectangle r5) {
  	   bl21=t;
  	   target21=r;
  	   rec21=r1;
  	   rec22=r2;
  	   rec23=r3;
  	 rec24=r4;
  	rec25=r5;
  	   t.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = t.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(t.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans32=true;
  		       }
  		       else {
  		     	  ans32=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans32==true&&ans33==false&&ans34==false&&ans35==false&&ans36==false) {
  		       rec21.setFill(Color.LIGHTGREEN);
  		     Score+=20.5;
  		       }else {
  		     	  rec22.setFill(Color.ORANGERED);
  		     	  rec23.setFill(Color.ORANGERED);
  		     	rec24.setFill(Color.ORANGERED);
  		     	rec25.setFill(Color.ORANGERED);
  		       
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       t.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans32==true) {
  		           t.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
   void drag123(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3,Rectangle r4,Rectangle r5) {
  	   bl22=t;
  	   target22=r;
  	   rec21=r1;
  	   rec22=r2;
  	   rec23=r3;
  	 rec24=r4;
  	rec25=r5;
  	   t.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = t.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(t.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans33=true;
  		       }
  		       else {
  		     	  ans33=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans32==true&&ans33==true&&ans34==false&&ans35==false&&ans36==false) {
  		       rec22.setFill(Color.LIGHTGREEN);
  		     Score+=20.5;
  		       }else {
  		     	  rec21.setFill(Color.ORANGERED);
  		     	  rec23.setFill(Color.ORANGERED);
  		     	rec24.setFill(Color.ORANGERED);
  		     	rec25.setFill(Color.ORANGERED);
  		       
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       t.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans33==true) {
  		           t.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
   void drag124(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3,Rectangle r4,Rectangle r5) {
  	   bl23=t;
  	   target23=r;
  	   rec21=r1;
  	   rec22=r2;
  	   rec23=r3;
  	 rec24=r4;
  	rec25=r5;
  	   t.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = t.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(t.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans34=true;
  		       }
  		       else {
  		     	  ans34=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans32==true&&ans33==true&&ans34==true&&ans35==false&&ans36==false) {
  		       rec23.setFill(Color.LIGHTGREEN);
  		      
  		       }else {
  		     	  rec22.setFill(Color.ORANGERED);
  		     	  rec21.setFill(Color.ORANGERED);
  		     	rec24.setFill(Color.ORANGERED);
  		     	rec25.setFill(Color.ORANGERED);
  		       
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       t.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans34==true) {
  		           t.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
   void drag125(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3,Rectangle r4,Rectangle r5) {
  	   bl24=t;
  	   target24=r;
  	   rec21=r1;
  	   rec22=r2;
  	   rec23=r3;
  	 rec24=r4;
  	rec25=r5;
  	   t.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = t.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(t.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans35=true;
  		       }
  		       else {
  		     	  ans35=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans32==true&&ans33==true&&ans34==true&&ans35==true&&ans36==false) {
  		       rec24.setFill(Color.LIGHTGREEN);
  		     Score+=20.5;
  		       }else {
  		     	  rec22.setFill(Color.ORANGERED);
  		     	  rec23.setFill(Color.ORANGERED);
  		     	rec21.setFill(Color.ORANGERED);
  		     	rec25.setFill(Color.ORANGERED);
  		       
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       t.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans35==true) {
  		           t.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
   void drag126(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3,Rectangle r4,Rectangle r5) {
  	   bl25=t;
  	   target25=r;
  	   rec21=r1;
  	   rec22=r2;
  	   rec23=r3;
  	 rec24=r4;
  	rec25=r5;
  	   t.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = t.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(t.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans36=true;
  		       }
  		       else {
  		     	  ans36=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans32==true&&ans33==true&&ans34==true&&ans35==true&&ans36==true) {
  		       rec25.setFill(Color.LIGHTGREEN);
  		      key3=true;
  		    Score+=20.5;
  		       }else {
  		     	  rec22.setFill(Color.ORANGERED);
  		     	  rec23.setFill(Color.ORANGERED);
  		     	rec24.setFill(Color.ORANGERED);
  		     	rec21.setFill(Color.ORANGERED);
  		       
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       t.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans36==true) {
  		           t.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
  
   
   //level4
   void drag132(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3,Rectangle r4,Rectangle r5,Rectangle r6) {
  	   b31=t;
  	   target31=r;
  	   rec31=r1;
  	   rec32=r2;
  	   rec33=r3;
  	 rec34=r4;
  	rec35=r5;
  	rec36=r5;
  	   t.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = t.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(t.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans42=true;
  		       }
  		       else {
  		     	  ans42=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans42==true&&ans43==false&&ans44==false&&ans45==false&&ans46==false&&ans47==false) {
  		       rec31.setFill(Color.LIGHTGREEN);
  		     Score+=50;
  		       }else {
  		     	  rec32.setFill(Color.ORANGERED);
  		     	  rec33.setFill(Color.ORANGERED);
  		     	rec34.setFill(Color.ORANGERED);
  		     	rec35.setFill(Color.ORANGERED);
  		     	rec36.setFill(Color.ORANGERED);
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       t.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans42==true) {
  		           t.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
   void drag133(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3,Rectangle r4,Rectangle r5,Rectangle r6) {
  	   bl32=t;
  	   target32=r;
  	   rec31=r1;
  	   rec32=r2;
  	   rec33=r3;
  	 rec34=r4;
  	rec35=r5;
  	rec36=r5;
  	   t.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = t.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(t.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans43=true;
  		       }
  		       else {
  		     	  ans43=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans42==true&&ans43==true&&ans44==false&&ans45==false&&ans46==false&&ans47==false) {
  		       rec32.setFill(Color.LIGHTGREEN);
  		     Score+=50;
  		       }else {
  		     	  rec31.setFill(Color.ORANGERED);
  		     	  rec33.setFill(Color.ORANGERED);
  		     	rec34.setFill(Color.ORANGERED);
  		     	rec35.setFill(Color.ORANGERED);
  		     	rec36.setFill(Color.ORANGERED);
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       t.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans43==true) {
  		           t.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
   void drag134(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3,Rectangle r4,Rectangle r5,Rectangle r6) {
  	   bl33=t;
  	   target33=r;
  	   rec31=r1;
  	   rec32=r2;
  	   rec33=r3;
  	 rec34=r4;
  	rec35=r5;
  	rec36=r5;
  	   t.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = t.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(t.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans44=true;
  		       }
  		       else {
  		     	  ans44=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans42==true&&ans43==true&&ans44==true&&ans45==false&&ans46==false&&ans47==false) {
  		       rec33.setFill(Color.LIGHTGREEN);
  		      
  		       }else {
  		     	  rec32.setFill(Color.ORANGERED);
  		     	  rec31.setFill(Color.ORANGERED);
  		     	rec34.setFill(Color.ORANGERED);
  		     	rec35.setFill(Color.ORANGERED);
  		     	rec36.setFill(Color.ORANGERED);
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       t.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans44==true) {
  		           t.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
   void drag135(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3,Rectangle r4,Rectangle r5,Rectangle r6) {
  	   bl34=t;
  	   target34=r;
  	   rec31=r1;
  	   rec32=r2;
  	   rec33=r3;
  	 rec34=r4;
  	rec35=r5;
  	rec36=r5;
  	   t.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = t.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(t.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans45=true;
  		       }
  		       else {
  		     	  ans45=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans42==true&&ans43==true&&ans44==true&&ans45==true&&ans46==false&&ans47==false) {
  		       rec34.setFill(Color.LIGHTGREEN);
  		     Score+=50;
  		       }else {
  		     	  rec32.setFill(Color.ORANGERED);
  		     	  rec33.setFill(Color.ORANGERED);
  		     	rec31.setFill(Color.ORANGERED);
  		     	rec35.setFill(Color.ORANGERED);
  		     	rec36.setFill(Color.ORANGERED);
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       t.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans45==true) {
  		           t.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
   void drag136(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3,Rectangle r4,Rectangle r5,Rectangle r6) {
  	   bl35=t;
  	   target35=r;
  	   rec31=r1;
  	   rec32=r2;
  	   rec33=r3;
  	 rec34=r4;
  	rec35=r5;
  	rec36=r5;
  	   t.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = t.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(t.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans46=true;
  		       }
  		       else {
  		     	  ans46=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans42==true&&ans43==true&&ans44==true&&ans45==true&&ans46==true&&ans47==false) {
  		       rec35.setFill(Color.LIGHTGREEN);
  		     Score+=50;
  		       }else {
  		     	  rec32.setFill(Color.ORANGERED);
  		     	  rec33.setFill(Color.ORANGERED);
  		     	rec34.setFill(Color.ORANGERED);
  		     	rec31.setFill(Color.ORANGERED);
  		     	rec36.setFill(Color.ORANGERED);
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       t.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans46==true) {
  		           t.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
   void drag137(Label t,Label r,Rectangle r1,Rectangle r2,Rectangle r3,Rectangle r4,Rectangle r5,Rectangle r6) {
  	   bl36=t;
  	   target36=r;
  	   rec31=r1;
  	   rec32=r2;
  	   rec33=r3;
  	 rec34=r4;
  	rec35=r5;
  	rec36=r5;
  	   t.setOnDragDetected(new EventHandler<MouseEvent>() {
  		   public void handle(MouseEvent event) {
  		       /* drag was detected, start a drag-and-drop gesture*/
  		       /* allow any transfer mode */
  		       Dragboard db = t.startDragAndDrop(TransferMode.ANY);
  		       
  		       /* Put a string on a dragboard */
  		       ClipboardContent content = new ClipboardContent();
  		       content.putString(t.getText());
  		       db.setContent(content);
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragOver(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data is dragged over the target */
  		       /* accept it only if it is not dragged from the same node 
  		        * and if it has a string data */
  		       if (event.getGestureSource() != r &&
  		               event.getDragboard().hasString()) {
  		           /* allow for both copying and moving, whatever user chooses */
  		           event.acceptTransferModes(TransferMode.MOVE);
  		           ans47=true;
  		       }
  		       else {
  		     	  ans47=false;
  		       }
  		       
  		       event.consume();
  		   }
  		 });
  		       r.setOnDragEntered(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		   /* the drag-and-drop gesture entered the target */
  		   /* show to the user that it is an actual gesture target */
  		        if (event.getGestureSource() != r &&
  		                event.getDragboard().hasString()) {
  		            r.setTextFill(Color.BLACK);
  		        }
  		               
  		        event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragExited(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* mouse moved away, remove the graphical cues */
  		       r.setTextFill(Color.BLACK);
  		       if(ans42==true&&ans43==true&&ans44==true&&ans45==true&&ans46==true&&ans47==true) {
  		       rec36.setFill(Color.LIGHTGREEN);
  		      key4=true;
  		    Score+=50;
  		       }else {
  		     	  rec32.setFill(Color.ORANGERED);
  		     	  rec33.setFill(Color.ORANGERED);
  		     	rec34.setFill(Color.ORANGERED);
  		     	rec35.setFill(Color.ORANGERED);
  		     	rec31.setFill(Color.ORANGERED);
  		       }
  		       event.consume();
  		   }
  		 });
  		       
  		       r.setOnDragDropped(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* data dropped */
  		       /* if there is a string data on dragboard, read it and use it */
  		       Dragboard db = event.getDragboard();
  		       boolean success = false;
  		       if (db.hasString()) {
  		          r.setText(db.getString());
  		          success = true;
  		       }
  		       /* let the source know whether the string was successfully 
  		        * transferred and used */
  		       event.setDropCompleted(success);
  		       
  		       event.consume();
  		    }
  		 });
  		       
  		       t.setOnDragDone(new EventHandler<DragEvent>() {
  		   public void handle(DragEvent event) {
  		       /* the drag and drop gesture ended */
  		       /* if the data was successfully moved, clear it */
  		       if (event.getTransferMode() == TransferMode.MOVE&&ans47==true) {
  		           t.setText("");
  		           r.setOpacity(1);
  		       }
  		       event.consume();
  		   }
  		 });
     }
  
   //level4
   
   
   
   
   



}





