<html>

    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>

    <body>
        <div class="container">
                <h2>Hello ma nigga</h2>
                <form method="POST" action="ServicioLogin">
                            <div class="row">
                                <div class="input-field col s12">
                                    <input id="text" name="username" type="text" class="validate">
                                    <label for="text">User Name</label>
                                </div>
                            </div>
                            </br>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input id="password" name="password" type="password" class="validate">
                                    <label for="password">Password</label>
                                </div>
                            </div>
                            </br>
                            <div class="row">
                                <div class="col s12 offset-s6">
                                    <button class="btn waves-effect waves-light center-align" type="submit" name="enviar">Enviar</button>
                                </div>
                            </div>
                        </form>
        </div>
    </body>
</html>
