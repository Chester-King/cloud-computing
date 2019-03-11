var express =require("express");
var app=express();
var bodyParser=require("body-parser");
var mongoose=require("mongoose");
var methodOverride=require("method-override")
var passport=require("passport")
var LocalStrategy= require("passport-local")
var User=require("./models/user")

function initMap() {
    // The location of Uluru
    var uluru = {
        lat: -25.344,
        lng: 131.036
    };
    // The map, centered at Uluru
    var map = new google.maps.Map(
        document.getElementById('map'), {
            zoom: 4,
            center: uluru
        });
    // The marker, positioned at Uluru
    var marker = new google.maps.Marker({
        position: uluru,
        map: map
    });
}

var indexRoutes=require("./routes/index");

mongoose.connect("mongodb://chesterking:qwe123rty@ds141783.mlab.com:41783/chesterking");
app.use(bodyParser.urlencoded({extended: true}));
app.set("view engine","ejs");
app.use(methodOverride("_method"));


// PASSPORT CONFIGURATION
app.use(require("express-session")({
    secret: "Peace in our time",
    resave: false,
    saveUnintialize: false
}));
app.use(passport.initialize());
app.use(passport.session());
passport.use(new LocalStrategy(User.authenticate()));
passport.serializeUser(User.serializeUser());
passport.deserializeUser(User.deserializeUser());

app.use(function(req,res,next){
    res.locals.currentUser=req.user;
    next();
});

app.use("/",indexRoutes);

app.listen( process.env.PORT||3000,function(){
    console.log("\nThe dragon rises...\n");
});

app.get("/author", function(req,res){
    res.render("author");
})

app.get("/details", function(req,res){
    res.render("details");
})

app.get("/locus", function(req,res){

    
    res.render("locus");
});

app.get("/maps", function(req,res){
   
    

   
    res.render("maps");
});