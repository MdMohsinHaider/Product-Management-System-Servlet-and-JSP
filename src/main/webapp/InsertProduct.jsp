<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Insert Product</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            padding: 0;
            background-color: #f4f4f4;
        }
        .form-container {
            background: #ffffff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            max-width: 500px;
            margin: auto;
        }
        .form-container h2 {
            margin-bottom: 20px;
            text-align: center;
        }
        .form-container label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }
        .form-container input, .form-container select {
            width: 100%;
            padding: 8px;
            margin-bottom: 20px;
            border: 1px solid #ddd;
            border-radius: 4px;
        }
        .form-container button {
            width: 100%;
            padding: 10px;
            background: #007BFF;
            color: #fff;
            border: none;
            border-radius: 4px;
            font-size: 16px;
        }
        .form-container button:hover {
            background: #0056b3;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Insert Product</h2>
        <form action="InsertProductServlet" method="post">
            <label for="productType">Product Type</label>
            <select id="productType" name="productType" required>
                <option value="">--Select Product Type--</option>
                <option value="Apparel">Apparel</option>
                <option value="ElectronicItem">Electronic Item</option>
                <option value="StationaryItem">Stationary Item</option>
            </select>

            <label for="productId">Product ID</label>
            <input type="number" id="productId" name="productId" required>

            <label for="productName">Product Name</label>
            <input type="text" id="productName" name="productName" required>

            <label for="price">Price</label>
            <input type="number" step="0.01" id="price" name="price" required>

            <label for="quantity">Quantity</label>
            <input type="number" id="quantity" name="quantity" required>

            <!-- Apparel Specific Fields -->
            <div id="apparelFields" style="display: none;">
                <label for="size">Size</label>
                <input type="text" id="size" name="size">

                <label for="color">Color</label>
                <input type="text" id="color" name="color">
            </div>

            <!-- Electronic Item Specific Fields -->
            <div id="electronicFields" style="display: none;">
                <label for="brand">Brand</label>
                <input type="text" id="brand" name="brand">

                <label for="warranty">Warranty (Months)</label>
                <input type="number" id="warranty" name="warranty">
            </div>

            <!-- Stationary Item Specific Fields -->
            <div id="stationaryFields" style="display: none;">
                <label for="category">Category</label>
                <input type="text" id="category" name="category">
            </div>

            <button type="submit">Insert Product</button>
        </form>
    </div>

    <script>
        // Show/hide specific fields based on selected product type
        document.getElementById("productType").addEventListener("change", function () {
            var selectedType = this.value;

            document.getElementById("apparelFields").style.display = selectedType === "Apparel" ? "block" : "none";
            document.getElementById("electronicFields").style.display = selectedType === "ElectronicItem" ? "block" : "none";
            document.getElementById("stationaryFields").style.display = selectedType === "StationaryItem" ? "block" : "none";
        });
    </script>
</body>
</html>
