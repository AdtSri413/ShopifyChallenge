# ShopifyChallenge
## This is my Technical Submission for the Backend Developer Intern Position at Shopify (Jan 2021)

I have created an interface for a potential hardware store. This hardware store sells fasteners in particular.

There are 10 products to choose from on the store. Each product is represented by an image of the product. Clicking on the image will bring up a description of the product in the bottom left textbox. Below that textbox is a spinner that allows you to select the quantity of the product that you would require. Beside that is where the price of the product is shown. When you have selected the product that you want and the amount that you want, click add to cart. This adds that product to the cart in the bottom right side. below the cart is where the total price of the items in your cart is shown. If you want to use the search bar in the upper left side, simply tupe anything into it. Any product that matches your search will be highlighted. You can search by type of product (nail, screw, etc), material (rass, steel, etc), finish (plain, bright, etc), or anything else that appears in the product description. When you are satisfied with the items in your cart, simply hit checkout to exit.

This program has been written using Java/Javafx. It has been coded in such a way that if you were to add more products, there are restrictions to prevent you from adding constraints that do not work together. For example, it has been coded such that a wing nut made of stainless steel must have a plain finish. Any other finish would throw an error.

The code for the visual interface is in `Fastener.fxml`, `main.java` and `FastenerController.java`. Everything else is backend.
