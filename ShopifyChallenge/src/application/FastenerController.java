package application;

import java.util.Optional;
import java.text.DecimalFormat;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class FastenerController
{
	
	@FXML
	private ImageView imageView1 = new ImageView();
	@FXML
	private ImageView imageView2 = new ImageView();
	@FXML
	private ImageView imageView3 = new ImageView();
	@FXML
	private ImageView imageView4 = new ImageView();
	@FXML
	private ImageView imageView5 = new ImageView();
	@FXML
	private ImageView imageView6 = new ImageView();
	@FXML
	private ImageView imageView7 = new ImageView();
	@FXML
	private ImageView imageView8 = new ImageView();
	@FXML
	private ImageView imageView9 = new ImageView();
	@FXML
	private ImageView imageView10 = new ImageView();
	
	@FXML
	private Image image1 = new Image("file:carriageBolt1.jpeg");
	@FXML
	private Image image2 = new Image("file:carriageBolt2.jpg");
	@FXML
	private Image image3 = new Image("file:commonNail1.png");
	@FXML
	private Image image4 = new Image("file:commonNail2.jpeg");
	@FXML
	private Image image5 = new Image("file:commonNail3.jpg");
	@FXML
	private Image image6 = new Image("file:wingNut1.jpeg");
	@FXML
	private Image image7 = new Image("file:wingNut2.jpeg");
	@FXML
	private Image image8 = new Image("file:wingNut3.jpeg");
	@FXML
	private Image image9 = new Image("file:woodscrew1.jpeg");
	@FXML
	private Image image10 = new Image("file:woodscrew2.jpeg");
	
//	@FXML
//	private Image image1 = new Image("carriageBolt2.jpg");
//	@FXML
//	private Image image2 = new Image("carriageBolt2.jpg");
//	@FXML
//	private Image image3 = new Image("carriageBolt2.jpg");
//	@FXML
//	private Image image4 = new Image("carriageBolt2.jpg");
//	@FXML
//	private Image image5 = new Image("carriageBolt2.jpg");
//	@FXML
//	private Image image6 = new Image("carriageBolt2.jpg");
//	@FXML
//	private Image image7 = new Image("carriageBolt2.jpg");
//	@FXML
//	private Image image8 = new Image("carriageBolt2.jpg");
//	@FXML
//	private Image image9 = new Image("carriageBolt2.jpg");
//	@FXML
//	private Image image10 = new Image("carriageBolt2.jpg");
//	
	
	@FXML
	private HBox HBox1 = new HBox();
    @FXML
    private HBox HBox2 = new HBox();
    @FXML
    private HBox HBox3 = new HBox();
    @FXML
    private HBox HBox4 = new HBox();
    @FXML
    private HBox HBox5 = new HBox();
    @FXML
    private HBox HBox6 = new HBox();
    @FXML
    private HBox HBox7 = new HBox();
    @FXML
    private HBox HBox8 = new HBox();
    @FXML
    private HBox HBox9 = new HBox();
    @FXML
    private HBox HBox10 = new HBox();
    
    @FXML
	private Label title = new Label();
    
    @FXML
	private TextField search = new TextField();
    @FXML
    private TextField priceOfProduct = new TextField();
    @FXML
    private TextField totalCost = new TextField();
    
    @FXML
	private Spinner<Integer> amount = new Spinner<Integer>();
    
    @FXML
	private TextArea productInfo = new TextArea();
    @FXML
	private TextArea receipt = new TextArea();
    
    @FXML
	private Button addToCart = new Button();
    @FXML
	private Button checkout = new Button();
	
    private Object lastClicked = new Object();
    private String order = "Cart:\n\n";
    private int numItems = 1;
    private double totalPrice = 0;
    private DecimalFormat format = new DecimalFormat("##.00");

    private void setUpImages()
    {
    	imageView1.setImage(image1);
		imageView1.setFitHeight(200);
        imageView1.setFitWidth(200);
        
        imageView2.setImage(image2);
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(200);
        
        imageView3.setImage(image3);
        imageView3.setFitHeight(200);
        imageView3.setFitWidth(200);
    
        imageView4.setImage(image4);
        imageView4.setFitHeight(200);
        imageView4.setFitWidth(200);
        
        imageView5.setImage(image5);
        imageView5.setFitHeight(200);
        imageView5.setFitWidth(200);
        
        imageView6.setImage(image6);
        imageView6.setFitHeight(200);
        imageView6.setFitWidth(200);
        
        imageView7.setImage(image7);
        imageView7.setFitHeight(200);
        imageView7.setFitWidth(200);
        
        imageView8.setImage(image8);
        imageView8.setFitHeight(200);
        imageView8.setFitWidth(200);
        
        imageView9.setImage(image9);
        imageView9.setFitHeight(200);
        imageView9.setFitWidth(200);
        
        imageView10.setImage(image10);
        imageView10.setFitHeight(200);
        imageView10.setFitWidth(200);
        
		HBox1.getChildren().add(imageView1);
		HBox1.setLayoutX(50.0);
        HBox1.setLayoutY(150.0);
        
        HBox2.getChildren().add(imageView2);
        HBox2.setLayoutX(300.0);
        HBox2.setLayoutY(150.0);
        
        HBox3.getChildren().add(imageView3);
        HBox3.setLayoutX(550.0);
        HBox3.setLayoutY(150.0);
        
        HBox4.getChildren().add(imageView4);
        HBox4.setLayoutX(800.0);
        HBox4.setLayoutY(150.0);
       
        HBox5.getChildren().add(imageView5);
        HBox5.setLayoutX(1050.0);
        HBox5.setLayoutY(150.0);
        
        HBox6.getChildren().add(imageView6);
        HBox6.setLayoutX(50.0);
        HBox6.setLayoutY(400.0);
        
        HBox7.getChildren().add(imageView7);
        HBox7.setLayoutX(300.0);
        HBox7.setLayoutY(400.0);
       
        HBox8.getChildren().add(imageView8);
        HBox8.setLayoutX(550.0);
        HBox8.setLayoutY(400.0);
        
        HBox9.getChildren().add(imageView9);
        HBox9.setLayoutX(800.0);
        HBox9.setLayoutY(400.0);
        
        HBox10.getChildren().add(imageView10);
        HBox10.setLayoutX(1050.0);
        HBox10.setLayoutY(400.0);
    }
    
    private double getPrice(Object o)
    {
    	return ((Fastener)o).getPrice();
    }
    
    private void displayInfo(Object o) throws IllegalFastener
    {
    	productInfo.setText(o.toString());
    }
    
	@FXML
	void initialize() throws IllegalFastener
	{
		setUpImages();
		priceOfProduct.setEditable(false);
		receipt.setEditable(false);
		productInfo.setEditable(false);
		totalCost.setEditable(false);
		
			CarriageBolt carriageBolt1 = new CarriageBolt(3.75, Threads.T8_32, Materials.ThreadedMaterials.Stainless_Steel, Finishes.BoltFinish.Plain, 7.99, 60);
			CarriageBolt carriageBolt2 = new CarriageBolt(5.00, Threads.T1_4_20, Materials.ThreadedMaterials.Steel, Finishes.BoltFinish.Yellow_Zinc, 10.99, 50);
			CommonNail commonNail1 = new CommonNail(NailDesigns.CommonNailSizes.S8D, NailDesigns.CommonNailLengths.L3_25, NailDesigns.CommonNailGauges.G10_25, Finishes.CommonNailFinish.Bright, 6.99, 100);
			CommonNail commonNail2 = new CommonNail(NailDesigns.CommonNailSizes.S12D, NailDesigns.CommonNailLengths.L2_5, NailDesigns.CommonNailGauges.G8, Finishes.CommonNailFinish.Hot_Dipped_Galvanized, 8.49, 90);
			CommonNail commonNail3 = new CommonNail(NailDesigns.CommonNailSizes.S16D, NailDesigns.CommonNailLengths.L6, NailDesigns.CommonNailGauges.G2, Finishes.CommonNailFinish.Bright, 7.99, 100);
			WingNut wingNut1 = new WingNut(Threads.T5_8_11, Materials.ThreadedMaterials.Brass, Finishes.WingNutFinish.Plain, 5.99, 75);
			WingNut wingNut2 = new WingNut(Threads.T10_13, Materials.ThreadedMaterials.Steel, Finishes.WingNutFinish.Zinc, 7.99, 75);
			WingNut wingNut3 = new WingNut(Threads.T3_8_16, Materials.ThreadedMaterials.Steel, Finishes.WingNutFinish.Chrome, 8.99, 80);
			WoodScrew woodScrew1 = new WoodScrew(4.5, Threads.T3_8_16, Materials.ThreadedMaterials.Brass, Finishes.ScrewFinish.Plain, ScrewDesigns.ScrewHeads.Bugle, ScrewDesigns.ScrewDrive.Philips, ScrewDesigns.WoodScrewPoints.Sharp, 8.49, 50);
			WoodScrew woodScrew2 = new WoodScrew(4.5, Threads.T1_4_20, Materials.ThreadedMaterials.Stainless_Steel, Finishes.ScrewFinish.Plain, ScrewDesigns.ScrewHeads.Flat, ScrewDesigns.ScrewDrive.Slotted, ScrewDesigns.WoodScrewPoints.Type_17, 6.99, 50);
	    
			displayInfo("Product Description:\n\n"+carriageBolt1);
			lastClicked = carriageBolt1;
			priceOfProduct.setText("$"+format.format(getPrice(lastClicked)*numItems));
			
		HBox1.setOnMousePressed(event -> {
			try
			{
				displayInfo("Product Description:\n\n"+carriageBolt1);
				lastClicked = carriageBolt1;
				priceOfProduct.setText("$"+format.format(getPrice(lastClicked)*numItems));
				
				HBox1.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
				HBox2.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox3.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox4.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox5.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox6.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox7.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox8.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox9.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox10.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			}
			catch(IllegalFastener e)
			{
				
			}
		});
		
		HBox2.setOnMousePressed(event -> {
			try
			{
				displayInfo("Product Description:\n\n"+carriageBolt2);
				lastClicked = carriageBolt2;
				priceOfProduct.setText("$"+format.format(getPrice(lastClicked)*numItems));
				
				HBox1.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox2.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
				HBox3.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox4.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox5.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox6.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox7.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox8.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox9.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox10.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				
			}
			catch(IllegalFastener e)
			{
				
			}
		});
		
		HBox3.setOnMousePressed(event -> {
			try
			{
				displayInfo("Product Description:\n\n"+commonNail1);
				lastClicked = commonNail1;
				priceOfProduct.setText("$"+format.format(getPrice(lastClicked)*numItems));
				
				HBox1.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox2.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox3.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
				HBox4.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox5.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox6.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox7.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox8.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox9.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox10.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			}
			catch(IllegalFastener e)
			{
				
			}
		});
		
		HBox4.setOnMousePressed(event -> {
			try
			{
				displayInfo("Product Description:\n\n"+commonNail2);
				lastClicked = commonNail2;
				priceOfProduct.setText("$"+format.format(getPrice(lastClicked)*numItems));
				
				HBox1.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox2.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox3.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox4.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
				HBox5.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox6.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox7.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox8.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox9.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox10.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			}
			catch(IllegalFastener e)
			{
				
			}
		});
		
		HBox5.setOnMousePressed(event -> {
			try
			{
				displayInfo("Product Description:\n\n"+commonNail3);
				lastClicked = commonNail3;
				priceOfProduct.setText("$"+format.format(getPrice(lastClicked)*numItems));
				
				HBox1.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox2.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox3.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox4.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox5.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
				HBox6.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox7.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox8.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox9.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox10.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			}
			catch(IllegalFastener e)
			{
				
			}
		});
		
		HBox6.setOnMousePressed(event -> {
			try
			{
				displayInfo("Product Description:\n\n"+wingNut1);
				lastClicked = wingNut1;
				priceOfProduct.setText("$"+format.format(getPrice(lastClicked)*numItems));
				
				HBox1.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox2.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox3.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox4.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox5.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox6.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
				HBox7.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox8.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox9.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox10.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			}
			catch(IllegalFastener e)
			{
				
			}
		});
		
		HBox7.setOnMousePressed(event -> {
			try
			{
				displayInfo("Product Description:\n\n"+wingNut2);
				lastClicked = wingNut2;
				priceOfProduct.setText("$"+format.format(getPrice(lastClicked)*numItems));
				
				HBox1.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox2.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox3.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox4.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox5.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox6.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox7.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
				HBox8.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox9.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox10.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			}
			catch(IllegalFastener e)
			{
				
			}
		});
		
		HBox8.setOnMousePressed(event -> {
			try
			{
				displayInfo("Product Description:\n\n"+wingNut3);
				lastClicked = wingNut3;
				priceOfProduct.setText("$"+format.format(getPrice(lastClicked)*numItems));
				
				HBox1.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox2.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox3.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox4.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox5.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox6.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox7.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox8.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
				HBox9.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox10.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			}
			catch(IllegalFastener e)
			{
				
			}
		});
		
		HBox9.setOnMousePressed(event -> {
			try
			{
				displayInfo("Product Description:\n\n"+woodScrew1);
				lastClicked = woodScrew1;
				priceOfProduct.setText("$"+format.format(getPrice(lastClicked)*numItems));
				
				HBox1.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox2.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox3.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox4.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox5.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox6.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox7.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox8.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox9.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
				HBox10.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			}
			catch(IllegalFastener e)
			{
				
			}
		});
		
		HBox10.setOnMousePressed(event -> {
			try
			{
				displayInfo("Product Description:\n\n"+woodScrew2);
				lastClicked = woodScrew2;
				priceOfProduct.setText("$"+format.format(getPrice(lastClicked)*numItems));
				
				HBox1.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox2.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox3.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox4.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox5.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox6.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox7.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox8.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox9.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
				        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
				        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
				HBox10.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
			}
			catch(IllegalFastener e)
			{
				
			}
		});
		
		addToCart.setOnAction(event ->
    	{
    		order+=lastClicked.toString()+" "+numItems+" orders."+"\n";
    		receipt.setText(order);
    		totalPrice += Double.parseDouble(priceOfProduct.getText().substring(1));
    		totalCost.setText("$"+format.format(totalPrice));
    	});
        
        amount.setEditable(true);
        SpinnerValueFactory<Integer> valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10000, 1);
        amount.setValueFactory(valueFactory);
        
        amount.getEditor().textProperty().addListener((observableValue, oldVal, newVal) ->
    	{
    		try
    		{
    			Integer.parseInt(newVal);
    		}
    		catch(NumberFormatException e)
    		{
    			amount.getEditor().setText(oldVal);
    			newVal = amount.getEditor().getText();
    		}
    		
    		if(Integer.parseInt(newVal)<1)
    			newVal="1";
    		else if(Integer.parseInt(newVal)>10000)
    			newVal="10000";
    		
	    	numItems = Integer.parseInt(newVal);
    		priceOfProduct.setText("$"+format.format(numItems*getPrice(lastClicked)));
    	});
        
        search.textProperty().addListener((observableValue, oldVal, newVal) ->
    	{
    		HBox1.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
			        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
			        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			HBox2.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
			        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
			        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			HBox3.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
			        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
			        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			HBox4.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
			        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
			        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			HBox5.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
			        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
			        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			HBox6.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
			        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
			        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			HBox7.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
			        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
			        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			HBox8.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
			        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
			        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			HBox9.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
			        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
			        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
			HBox10.setStyle("-fx-padding: 0;" + "-fx-border-style: solid;"
			        + "-fx-border-width: 0;" + "-fx-border-insets: 0;"
			        + "-fx-border-radius: 0;" + "-fx-border-color: blue;");
    		
    		if(((carriageBolt1.toString()).toLowerCase()).contains(newVal.toLowerCase()))
    		{
    			HBox1.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
   			}
    		if(((carriageBolt2.toString()).toLowerCase()).contains(newVal.toLowerCase()))
    		{
    			HBox2.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
   			}
    		if(((commonNail1.toString()).toLowerCase()).contains(newVal.toLowerCase()))
    		{
    			HBox3.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
   			}
    		if(((commonNail2.toString()).toLowerCase()).contains(newVal.toLowerCase()))
    		{
    			HBox4.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
   			}
    		if(((commonNail3.toString()).toLowerCase()).contains(newVal.toLowerCase()))
    		{
    			HBox5.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
   			}
    		if(((wingNut1.toString()).toLowerCase()).contains(newVal.toLowerCase()))
    		{
    			HBox6.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
   			}
    		if(((wingNut2.toString()).toLowerCase()).contains(newVal.toLowerCase()))
    		{
    			HBox7.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
   			}
    		if(((wingNut3.toString()).toLowerCase()).contains(newVal.toLowerCase()))
    		{
    			HBox8.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
   			}
    		if(((woodScrew1.toString()).toLowerCase()).contains(newVal.toLowerCase()))
    		{
    			HBox9.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
   			}
    		if(((woodScrew2.toString()).toLowerCase()).contains(newVal.toLowerCase()))
    		{
    			HBox10.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
				        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				        + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
   			}
    	});
        
        checkout.setOnAction(event ->
    	{
    		Alert done = new Alert(AlertType.INFORMATION);
    		
    		if(receipt.getText().trim().length() != 0)
    		{
        		done.setTitle("Checkout Complete!");
        	    done.setHeaderText("Checkout Complete! Your total was $"+ format.format(totalPrice));
        	    done.setContentText("Thank you for shopping with us. Have a great day!");
        	    done.showAndWait();
        		System.exit(0);
    		}
    		
    		Alert areYouSure = new Alert(AlertType.CONFIRMATION);
			areYouSure.setTitle("Wait!");
    		areYouSure.setHeaderText("Are you sure you want to check out?");
    		areYouSure.setContentText("Your cart is empty!");
    		
    		Optional<ButtonType> answer = areYouSure.showAndWait();
    		
    		if (answer.get() == ButtonType.OK)
    		{
    			done.setTitle("Checkout Complete!");
        	    done.setHeaderText("Checkout Complete!");
        	    done.setContentText("Thank you for shopping with us. Have a great day!");
        	    done.showAndWait();
        		System.exit(0);
    		}
    	});
        
	}
}
