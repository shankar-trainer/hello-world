<?php
class Bird
{
    public function fly()
    {
        echo "<br>bird flies";
    }
}

class Penguin extends Bird
{
    #[Override]
    public function fly()
    {
        throw new Exception("penguin can not fly "); 
        // violation of lsp
    }
}
