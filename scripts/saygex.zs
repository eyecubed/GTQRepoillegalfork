import mods.dropt.Dropt;

Dropt.list("crafting_table")

  .add(Dropt.rule()
      .matchBlocks(["minecraft:crafting_table"])
      .addDrop(Dropt.drop()
          .items([<minecraft:planks>])
      )
  );