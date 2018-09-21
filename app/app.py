from flask import Flask, render_template
app = Flask(__name__)

@app.route("/")
def index():
    return "."

@app.route("/my_foist_template")
def template():
    coll = [0,1,1,2,3,5,8]
    return render_template("template.html", foo = "Numbers in a Collection", collection = coll )

if __name__ == "__main__":
    app.debug = True
    app.run()
